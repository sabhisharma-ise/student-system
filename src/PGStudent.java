/* PGStudent Class extending the Student Class, an example of Inheritance in OOP */

public class PGStudent extends Student{

    // Private Instance Variables
    private String specialization;
    final private String UGDegree;  // to prohibit any modifications to UGDegree attribute

    // Public Constructor
    public PGStudent(String USN, String name, String specialization, String UGDegree) {
        super(USN, name);
        this.specialization = specialization;
        this.UGDegree = UGDegree;
    }

    // Public method (returnType: String) to get specialization of a student
    public String getSpecialization() {
        return this.specialization;
    }

    // Public method (returnType: void) to set specialization of a student
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Public method (returnType: String) to get UGDegree of a student
    public String getUGDegree() {
        return this.UGDegree;
    }

    // Public method (returnType: void) to set UGDegree of a student
//    public void setUGDegree(String UGDegree) {
//        this.UGDegree = UGDegree;
//    }
    // if UGDegree attribute is set to be final, then setUGDegree() method will not work
}
