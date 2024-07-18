package Java_Projets.Day6;

public class ClassA {
    String firstName;
    String lastName;

    public ClassA(String firstName, String lastName) {
        this.firstName = firstName;
    }

    public ClassA(String lastName) {
        this.lastName = lastName;
    }

    public void print() {
        System.out.println(lastName + " " + firstName);
    }
}
