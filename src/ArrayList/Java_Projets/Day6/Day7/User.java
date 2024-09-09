package ArrayList.Java_Projets.Day6.Day7;

public class User {
    private int age;

    public User(int age) {

        if (age > 0 && age <= 120) setAge(age);
        else System.out.println("Are you sure?");

    }

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) this.age = age;
        else System.out.println("Set the correct age");
    }

    public void PrintUserAge() {
        System.out.println("Your age is: " + getAge());
    }
}
