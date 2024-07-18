package Week_1.Day_1;

public class What_is_JAVA {
    /* welcome to the world of programming and Java! Imagine you want
    to build a toy car. You'd need some materials like plastic, metal,
    and rubber wheels,right? But you'd also need a set of instructions
    to know how to put these materials together to make a working toy
    car.

    In the digital world, Java is like a set of instructions
    (or a "recipe") for building different kinds of software.Just like
    the toy car needs materials and instructions,software needs code to
    tell a computer what to do. Java is one of many programming
    languages you can use to write this code.
    Java is especially popular for building big, complex systems like
    online banking software, Android apps, and even websites.
    It's like a versatile tool in your toolbox that you can use to
    build all kinds of different things.

    In a nutshell, Java is a programming language that you can use
    to tell a computer how to perform tasks. It's like teaching the
    computer a new language so that you can instruct it to do what
    you want, whether that's running a website, operating an ATM, or
    even controlling a space rover on Mars! */
    public static void main(String[] args) {
        String firstName = "Alexander Morphy";
        // firstName = firstName.replace("Alexander Morphy", "Eric");
        // System.out.println(firstName);
        //   System.out.println(firstName.substring(1));
        //  System.out.println(firstName.replace("z", "Ko"));
        System.out.println(firstName.substring(2, 4));
        System.out.println(firstName.charAt(4));
        int in = 58;
        float gs = 58.20F;
        System.out.println(in == gs);

    }
}
