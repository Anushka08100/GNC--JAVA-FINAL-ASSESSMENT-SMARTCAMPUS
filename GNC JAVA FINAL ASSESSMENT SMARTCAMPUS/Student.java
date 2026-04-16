// This class stores student details
public class Student{
    int studentid;
    String name;
    String course;
    // Constructor to initialize student details
    Student(int studentid, String name, String course){
        this.studentid = studentid;
        this.name = name;
        this.course = course;
    }
    // Method to display student details
    void displayDetails(){
        System.out.println("Student ID: " + studentid);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
    public static void main(String[] args) {
        Student student = new Student(1, "Anushka", "Computer Science");
        student.displayDetails();
    }
}