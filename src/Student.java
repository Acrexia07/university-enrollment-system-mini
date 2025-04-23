public class Student {

    // Initialization: Variable Declaration
    String studentId;
    String studentName;
    Course[] enrolledCourses;

    // Constructor
    Student (String studentId, String studentName, Course[] enrolledCourses){
        this.studentId = studentId;
        this.studentName = studentName;
        this.enrolledCourses = enrolledCourses;
    }

    // Method: Displays Student information
    void displayStudentInfo(){
        System.out.println("\n==== Student Information ====");
        System.out.println("\nStudent Name: " + this.studentName);
        System.out.println("Student ID: " + this.studentId);
        System.out.println("\nCourses Enrolled: ");

        // Process: For aggregation
        for (Course course : enrolledCourses) {
            System.out.println(course.displayCourseDetails());
        }
    }
}
