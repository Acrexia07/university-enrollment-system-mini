import java.util.Scanner;

//Note: This mini project is created to apply the concept of Aggregation
//Principle highlighted: OOP Principle, DRY Principle

public class Main {

    public static void main(String[] args) {

        // Initialization: Variable Declaration
        Scanner scn = new Scanner(System.in);
        String studentName;
        int numOfCourses;

        // Initialization: Welcome Message
        System.out.println("Welcome to the Enrollment System!\n");

        // Input: User input - Student basic information
        System.out.println("==== Register Student Account ====");
        System.out.print("Enter your Name: ");
        studentName = scn.nextLine();
        System.out.print("Enter your Student ID: ");
        String studentID = scn.nextLine().toUpperCase();

        // Method: Validate user input - Integer data type
        numOfCourses = validateInput_Integer(scn, "How many courses that you enrolled?: ");

        // Process: Initialize a 'courses' array based on the numOfCourses index
        Course[] courses = new Course[numOfCourses];

        // Process: Loop based on numOfCourses' index
        for (int i = 0; i < courses.length; i++) {
            // Process: Pass all the data to the course array
            System.out.println("\nCourse no." + (i + 1));
            courses[i] = courseDetails(scn);
        }

        // Process: Pass all the data (also the course array) to the new Student object
        Student studentInfo = new Student(studentID, studentName, courses);

        // Output: Display Student Info with its Courses
        studentInfo.displayStudentInfo();

        // Exit: Close Scanner object
        scn.close();
    }

    // Method: Validate user input - Integer data type
    static int validateInput_Integer (Scanner scn, String prompt){

        // Initialization: Variable Declaration
        int inputInt;

        // Process: Validates user input (Positive whole number)
        while(true){
            System.out.print(prompt);
            if(!scn.hasNextInt()){
                System.out.println("Invalid Input: Input accepts whole number only! Please try again.");
                scn.next();
            }
            else {
                inputInt = scn.nextInt();
                scn.nextLine(); // Clears scanner buffer

                // Process: Validate if the inputted integer is less than or equal to 0.
                if (inputInt <= 0) {
                    System.out.println("Invalid input: Enter a number greater than 0! Please try again.");
                }
                else {
                    break;
                }
            }
        }
        return inputInt;
    }

    static Course courseDetails (Scanner scn){

        // Input: User Input - Course Information
        System.out.print("Course Name: ");
        String courseName = scn.nextLine();
        System.out.print("Course Code: ");
        String courseCode = scn.nextLine().toUpperCase();

        // Process: Validate user input
        int creditUnits = validateInput_Integer(scn, "Credited Units: ");

        return new Course(courseCode, courseName, creditUnits);
    }
}
