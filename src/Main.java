import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ugNo, pgNo, total = 0;
        do {
            System.out.println("Minimum Capacity: 10");
            System.out.print("Number of UG Students: ");
            ugNo = in.nextInt();
            System.out.print("Number of PG Students: ");
            pgNo = in.nextInt();
            total = ugNo + pgNo;
        } while(total < 10);

        in.nextLine();  // Consume newline left-over

        System.out.println("Let's Proceed!");

        /* Create an array of objects (type: Student Class) */
        Student[] arr = new Student[total];

        // Input
        System.out.println("Enter UG Student's Details: ");
        for (int i = 0; i < ugNo; i++) {
            arr[i] = new UGStudent("", "", 0, "");

            System.out.println("Student " + (i + 1));

            System.out.print("USN: ");
            arr[i].setUSN(in.nextLine());

            System.out.print("Name: ");
            arr[i].setName(in.nextLine());

            System.out.print("Semester: ");
            ((UGStudent) arr[i]).setSemester(in.nextInt());

            in.nextLine();  // Consume newline left-over

            System.out.print("Branch: ");
            ((UGStudent) arr[i]).setBranch(in.nextLine());
        }

        System.out.println("Enter PG Student's Details: ");
        for (int i = ugNo; i < total; i++) {
            arr[i] = new PGStudent("", "", "", "BE");

            System.out.println("Student " + (i + 1));

            System.out.print("USN: ");
            arr[i].setUSN(in.nextLine());

            System.out.print("Name: ");
            arr[i].setName(in.nextLine());

            System.out.print("Specialization: ");
            ((PGStudent) arr[i]).setSpecialization(in.nextLine());
        }

        // Output
        System.out.println("UG Student's Details: ");
        printStudentDetails(arr, 0, ugNo);

        System.out.println("PG Student's Details: ");
        printStudentDetails(arr, ugNo, total);
    }

    // Method to print student details
    static void printStudentDetails(Student[] arr, int startingIndex, int endingIndex) {

        for (int i = startingIndex; i < endingIndex; i++) {

            System.out.println("Student " + (i + 1));

            System.out.print("USN: " + arr[i].getUSN() + ", ");

            System.out.print("Name: " + arr[i].getName() + ", ");

            if (arr[i] instanceof UGStudent ugStudent) {

                System.out.print("Semester: " + ugStudent.getSemester() + ", ");

                System.out.print("Branch: " + ugStudent.getBranch() + "\n");

            }
            else if (arr[i] instanceof PGStudent pgStudent) {

                System.out.print("Specialization: " + pgStudent.getSpecialization() + ", ");

                System.out.print("UGDegree: " + pgStudent.getUGDegree() + "\n");

            }
        }
    }
}