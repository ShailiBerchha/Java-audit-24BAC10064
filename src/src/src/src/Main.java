public class Main {

    public static void main(String[] args) {

        System.out.println(
            "===== OOP ACADEMIC MANAGEMENT SYSTEM ====="
        );

        System.out.println();

        // Creating Student object
        Student student = new Student(
            "S101",
            "Rahul Sharma",
            "rahul@gmail.com",
            3.6
        );

        // Creating GraduateStudent object
        GraduateStudent graduateStudent =
            new GraduateStudent(
                "G201",
                "Priya Singh",
                "priya@gmail.com",
                3.9,
                1500.00
            );

        // Display Student record
        System.out.println("----- Student -----");

        student.displayRecord();

        System.out.println(
            "Tuition Fee: "
            + student.calculateTuitionFee()
        );

        System.out.println();

        // Display Graduate Student record
        System.out.println("----- Graduate Student -----");

        graduateStudent.displayRecord();

        System.out.println();

        // Runtime Polymorphism
        System.out.println(
            "----- Runtime Polymorphism -----"
        );

        Student reference = graduateStudent;

        reference.displayRecord();

        System.out.println(
            "Polymorphic Tuition Fee: "
            + reference.calculateTuitionFee()
        );

        System.out.println();

        // Interface Reference
        System.out.println(
            "----- Interface Reference -----"
        );

        SystemOperations operation = graduateStudent;

        operation.displayRecord();

        System.out.println(
            "Interface Tuition Fee: "
            + operation.calculateTuitionFee()
        );
    }
}
