package Array_test;

public class Test5 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Reversed: " + reverseNumber(12345));
    }

    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return reverse;

    }

    public boolean isPalindrome(int x) {
        int rem;
        int rev = 0;
        int x1 = x;
        while (x > 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return x1 == rev;
    }

}