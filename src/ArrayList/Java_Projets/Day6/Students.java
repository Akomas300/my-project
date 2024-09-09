package ArrayList.Java_Projets.Day6;

public class Students extends Employees {
    String studentID;
    char studentGrad;

    public Students(String firstName, String lastName, String studentID, char studentGrad) {
        super(firstName, lastName);
        this.studentID = studentID;
        this.studentGrad = studentGrad;
    }

    public void printInfo() {
        System.out.println("First Name: " + super.firstName);
        System.out.println("Last Name: " + super.lastName);
        System.out.println("ID: " + studentID);
        System.out.println("Grad: " + studentGrad);
    }
}