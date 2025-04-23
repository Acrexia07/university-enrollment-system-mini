public class Course {

    // Initialization: Variable Declaration
    String courseCode;
    String courseName;
    int creditUnits;

    // Constructor
    Course (String courseCode, String courseName, int creditUnits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditUnits = creditUnits;
    }

    // Method: Displays Course Information
    String displayCourseDetails(){
        return String.format("[Code: %s] %s - Credited Units: %d units.",this.courseCode, this.courseName, this.creditUnits);
    }
}
