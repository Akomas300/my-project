package ArrayList.Day4.Day5;

public class CollegeStudent {

    // Variables
    double gpa;
    String diploma;
    String[] courses;


    // Method to Print college student info
    public void printCollegeStudentInfo() {
        System.out.println("GPA: " + gpa);
        System.out.println("diploma: " + gpa);
        printCourses();
    }

    // Method to print elements of array ( Courses )
    private void printCourses() {
        for (String course : courses) {
            System.out.println("courses: " + course);
        }
    }

}

