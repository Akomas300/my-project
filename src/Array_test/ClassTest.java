package Array_test;

public class ClassTest {
    public static void fullName(String LastName, String firstName) {
        LastName = LastName.toUpperCase();
        firstName = firstName.replace(firstName.substring(0, 1), firstName.substring(0, 1).toUpperCase());
        System.out.println(LastName + ", " + firstName);
    }

    public static void main(String[] args) {
        fullName("akowanou", "mathias");
    }
}
