package ArrayList.Java_Projets.Day6;

public class Employees {
    public String firstName;
    public String lastName;
    private String dateOfBirth;
    //Employees Unique variables
    private double salary;
    private String startDate;
    private String occupation;

    public Employees(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Getter

    public static void main(String[] args) {
        var obj = new Employees("Mathias", "Akowanou");
        obj.printEmployeesInfo();

    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    private String getStartDate() {
        return startDate;
    }

    private void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    private String getOccupation() {
        return occupation;
    }

    private void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    private void printEmployeesInfo() {
        System.out.println("Employee First Name: " + firstName);
        System.out.println("Employee Last Name: " + lastName);
        System.out.println("Employee Occupation: " + getOccupation());

    }
}
