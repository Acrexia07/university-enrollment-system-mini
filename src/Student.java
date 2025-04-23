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

    void displayStudentInfo(){
        System.out.println("==== Student Information ====");
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Courses Enrolled: ");

        // Process: For aggregation
        for (Course course : enrolledCourses) {
            System.out.println(course.displayCourseDetails());
        }
    }
}
