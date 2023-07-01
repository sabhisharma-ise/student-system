import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ug_no, pg_no, total;
        do {
            System.out.println("Minimum Capacity: 10");
            System.out.print("Number of UG Students: ");
            ug_no = in.nextInt();
            System.out.print("Number of PG Students: ");
            pg_no = in.nextInt();
            total = ug_no + pg_no;
        } while(total < 10);

        in.nextLine();  // Consume newline left-over

        System.out.println("Let's Proceed!");

        /* Create an array of objects (type: Student Class) */
        Student[] arr = new Student[total];

        // Input
        System.out.println("Enter UG Student's Details: ");
        for (int i = 0; i <= ug_no - 1; i++) {
            arr[i] = new UGStudent("4NI21IS001", "A", 1, "CSE");

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
        for (int i = ug_no; i <= total - 1; i++) {
            arr[i] = new PGStudent("4NI21IS001", "A", "CN", "BE");

            System.out.println("Student " + (i + 1));

            System.out.print("USN: ");
            arr[i].setUSN(in.nextLine());

            System.out.print("Name: ");
            arr[i].setName(in.nextLine());

            System.out.print("Specialization: ");
            ((PGStudent) arr[i]).setSpecialization(in.nextLine());

//            System.out.print("UGDegree: ");
//            ((PGStudent) arr[i]).setUGDegree(in.nextLine());
        }

        // Output
        System.out.println("UG Student's Details: ");
        for (int i = 0; i <= ug_no - 1; i++) {

            System.out.println("Student " + (i + 1));

            System.out.print("USN: " + arr[i].getUSN() + ", ");

            System.out.print("Name: " + arr[i].getName() + ", ");

            System.out.print("Semester: " + ((UGStudent) arr[i]).getSemester() + ", ");

            System.out.print("Branch: " + ((UGStudent) arr[i]).getBranch() + "\n");
        }

        System.out.println("PG Student's Details: ");
        for (int i = ug_no; i <= total - 1; i++) {

            System.out.println("Student " + (i + 1));

            System.out.print("USN: " + arr[i].getUSN() + ", ");

            System.out.print("Name: " + arr[i].getName() + ", ");

            System.out.print("Specialization: " + ((PGStudent) arr[i]).getSpecialization() + ", ");

            System.out.print("UGDegree: " + ((PGStudent) arr[i]).getUGDegree() + "\n");
        }
    }
}