package ArrayList.Day4;

public class Example3 {
    public static void main(String[] args) {
        int count = 0;
        String[] names = {"bob", "Bob", "B0B", "mathi", "bob"};
        for (String name : names) {
            if (name.equals("bob")) {
                System.out.println(name);
                count++;
            }
        }
        System.out.println(count);
    }
}
