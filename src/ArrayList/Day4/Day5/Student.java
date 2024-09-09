package ArrayList.Day4.Day5;

public class Student {
    private String studentFirstName;
    private String studentLastName;
    private String dateOfDate;

    public Student(String studentFirstName, String studentLastName, String dateOfDate) {
        setStudentFirstName(studentFirstName);
        setStudentLastName(studentLastName);
        setDateOfDate(dateOfDate);
    }

    private String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    private String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    private String getDateOfDate() {
        return dateOfDate;
    }

    public void setDateOfDate(String dateOfDate) {
        this.dateOfDate = dateOfDate;
    }

    public void pintStudentInformation() {
        System.out.println("Your first name is: " + getStudentFirstName());
        System.out.println("Your last name is: " + getStudentLastName());
        System.out.println("And your birth date is: " + getDateOfDate());
    }
}
