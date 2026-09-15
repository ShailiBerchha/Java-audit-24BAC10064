public abstract class Person implements SystemOperations {

    private final String personId;
    private String name;
    private String email;

    public Person(String personId, String name, String email) {
        this.personId = personId;
        this.setName(name);
        this.setEmail(email);
    }

    public String getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Name cannot be null or empty."
            );
        }

        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException(
                "Invalid email format."
            );
        }

        this.email = email;
    }
}
