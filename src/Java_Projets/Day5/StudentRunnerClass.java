package Java_Projets.Day5;

public class StudentRunnerClass {
    public static void main(String[] args) {
        var objStudentOne = new Student("Mathias", "Akowanou", "11/16/1994");
        var objStudentTwo = new Student("Groria", "Sokenou", "02/09/2022");
        objStudentOne.pintStudentInformation();
        System.out.println("*****************************************************");
        objStudentTwo.pintStudentInformation();
    }
}
