import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // List to store students
        ArrayList<Student> students = new ArrayList<>();

        // List to store courses
        ArrayList<Course> courses = new ArrayList<>();

        // Object of Enrollment class
        Enrollment enrollment = new Enrollment();

        // Menu-driven program
        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Courses");
            System.out.println("6. View Enrollments");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Add student
                    System.out.print("Enter ID Name Email: ");
                    int sid = sc.nextInt();
                    String name = sc.next();
                    String email = sc.next();

                    students.add(new Student(sid, name, email));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // Add course
                    System.out.print("Enter Course ID Name Fee: ");
                    int cid = sc.nextInt();
                    String cname = sc.next();
                    double fee = sc.nextDouble();

                    courses.add(new Course(cid, cname, fee));
                    System.out.println("Course added successfully!");
                    break;

                case 3:
                    // Enroll student
                    System.out.print("Enter Student ID: ");
                    int esid = sc.nextInt();

                    System.out.print("Enter Course ID: ");
                    int ecid = sc.nextInt();

                    enrollment.enroll(esid, ecid);
                    break;

                case 4:
                    // View students
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : students) {
                            s.displayDetails();
                        }
                    }
                    break;

                case 5:
                    // View courses
                    if (courses.isEmpty()) {
                        System.out.println("No courses found.");
                    } else {
                        for (Course c : courses) {
                            c.displayDetails();
                        }
                    }
                    break;

                case 6:
                    // View enrollments
                    enrollment.display();
                    break;

                case 7:
                    // Exit
                    System.out.println("Program exited.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}