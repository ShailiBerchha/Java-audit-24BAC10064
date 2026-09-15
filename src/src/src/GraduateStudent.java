public class GraduateStudent extends Student {

    private double researchGrant;

    public GraduateStudent(
        String id,
        String name,
        String email,
        double gpa,
        double grant
    ) {

        super(id, name, email, gpa);

        this.setResearchGrant(grant);
    }

    public double getResearchGrant() {
        return researchGrant;
    }

    public void setResearchGrant(double researchGrant) {

        if (researchGrant < 0) {
            throw new IllegalArgumentException(
                "Research grant cannot be negative."
            );
        }

        this.researchGrant = researchGrant;
    }

    @Override
    public double calculateTuitionFee() {

        return Math.max(
            0.0,
            super.calculateTuitionFee()
                + 2000.00
                - researchGrant
        );
    }

    @Override
    public void displayRecord() {

        System.out.println(
            "ID: " + getPersonId()
            + " | Name: " + getName()
            + " | GPA: " + getGpa()
            + " | Research Grant: " + researchGrant
            + " | Tuition Fee: " + calculateTuitionFee()
        );
    }
}
