import java.util.*;

class Enrollment {

    HashMap<Integer, ArrayList<Integer>> enrollments = new HashMap<>();

    void enroll(int studentId, int courseId) {
        enrollments.putIfAbsent(studentId, new ArrayList<>());
        enrollments.get(studentId).add(courseId);
    }

    // display method
    void display() {
        for (int sid : enrollments.keySet()) {
            System.out.println("Student " + sid + " -> " + enrollments.get(sid));
        }
    }

    // ✅ MAIN METHOD MUST BE INSIDE CLASS
    public static void main(String[] args) {

        Enrollment enrollment = new Enrollment();

        enrollment.enroll(1, 101);
        enrollment.enroll(1, 102);
        enrollment.enroll(2, 101);

        enrollment.display();
    }
}