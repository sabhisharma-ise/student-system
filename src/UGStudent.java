/* UGStudent Class extending the Student Class, an example of Inheritance in OOP */

public class UGStudent extends Student{

    // Private Instance Variables
    private int semester;
    private String branch;

    // Public Constructor
    public UGStudent(String USN, String name, int semester, String branch) {
        super(USN, name);
        this.semester = semester;
        this.branch = branch;
    }

    // Public method (returnType: int) to get semester of a student
    public int getSemester() {
        return this.semester;
    }

    // Public method (returnType: void) to set semester of a student
    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Public method (returnType: String) to get branch of a student
    public String getBranch() {
        return this.branch;
    }

    // Public method (returnType: void) to set branch of a student
    public void setBranch(String branch) {
        this.branch = branch;
    }
}
