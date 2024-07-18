package Week_2.Day_1;

public class Problem_Statement {
    public static void main(String[] args) {
        String str = "Java is more than Java, it's a platform!";
        str = str.replace("Java", "JAVA");
        System.out.println(str);


        System.out.println(" Hello, World! ".trim());
        if (((" Java".trim()).equals("Java ".trim()))) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }


        String str2 = " ERROR ";
        str2 = str2.trim();
        str2 = str2.toLowerCase();
        str2 = str2.replace("error", "warning");
        System.out.println(str2);


        System.out.println("environment".indexOf('e'));


        System.out.println("concatenation".indexOf("cat"));


        System.out.println("Hello, world".indexOf("Java"));


    }
}
