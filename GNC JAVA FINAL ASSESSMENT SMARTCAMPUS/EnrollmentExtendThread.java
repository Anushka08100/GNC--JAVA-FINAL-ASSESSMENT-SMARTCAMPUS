// Thread class
class Enrollment extends Thread {

    String name;

    Enrollment(String name) {
        this.name = name;
    }

    public void run() {
        try {
            System.out.println("Processing enrollment for " + name);
            Thread.sleep(1000); // simulate delay
            System.out.println("Enrollment completed for " + name);
        } catch (InterruptedException e) {
            System.out.println("Error in thread");
        }
    }
}

public class EnrollmentExtendThread {
    public static void main(String[] args) {

        // Creating multiple threads
        Enrollment t1 = new Enrollment("Anushka");
        Enrollment t2 = new Enrollment("Aarohi");

        t1.start();
        t2.start();
    }
}