// This class stores course details
class Course{
    int courseid;
    String courseName;
    double fee;
    //Constructer to initialize course data
    Course(int courseid,String courseName,double fee){
        this.courseid = courseid;
        this.courseName = courseName;
        this.fee = fee;
    }
    //Method to display course details
    void displayDetails(){
        System.out.println("Course ID: " + courseid);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Fee: " + fee);
    }
    public static void main(String[] args) {
        Course course = new Course(031, "Computer Science", 50000.0);
        course.displayDetails();
    }

}