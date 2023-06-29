/* Student Class */

public class Student {

    // Private Instance Variables
    private String USN;
    private String name;

    // Public Constructor
    public Student(String USN, String name) {
        this.USN = USN;
        this.name = name;
    }

    // Public method (returnType: String) to get USN of a student
    public String getUSN() {
        return this.USN;
    }

    // Public method (returnType: void) to set USN of a student
    public void setUSN(String USN) {
        this.USN = USN;
    }

    // Public method (returnType: String) to get name of a student
    public String getName() {
        return this.name;
    }

    // Public method (returnType: void) to set name of a student
    public void setName(String name) {
        this.name = name;
    }
}
