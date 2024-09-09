package Array_test;

public class Test8 {
    //The first way and best way to reverse a string using a for loop
    public static void main(String[] args) {
        String str = "Java is , not hard";
        String reverse1 = "";
        for (int index = (str.length() - 1); index >= 0; index--) {
            // reverse=reverse+str.charAt(index)
            reverse1 += str.charAt(index);
        }
        System.out.println(reverse1);
        System.out.println("**************************************************");


        //The second way to reverse a string using a for loop
        String reverse2 = "";
        for (int index = 0; index < str.length(); index++) {
            reverse2 = str.charAt(index) + reverse2;
        }
        System.out.println(reverse2);
        System.out.println("**************************************");
        //Other easy way using for each for loop
        String reverse3 = "";
        for (char c : str.toCharArray()) {
            reverse3 = c + reverse3;
        }
        System.out.println(reverse3);
    }
}
