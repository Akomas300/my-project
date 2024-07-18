package Java_Projets.Day5;

public class UserInfo {

    // Variables
    int id;
    String firstName;
    String lastName;
    int age;
    String dateOfBirth;
    String occupation;

    // Constructor
    public UserInfo(int id, String firstName, String lastName, int age, String dateOfBirth, String occupation) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setDateOfBirth(dateOfBirth);
        setOccupation(occupation);
    }

    // Method to print ClassA Information
    public void printUserInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("age: " + age);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Occupation: " + occupation);
    }

    // Getters
    public int getId() {
        return id;
    }

    // Setters
    private void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOccupation() {
        return occupation;
    }

    private void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}

