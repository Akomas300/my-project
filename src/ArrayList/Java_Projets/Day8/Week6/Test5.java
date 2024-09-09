package ArrayList.Java_Projets.Day8.Week6;

public class Test5 {
    private String massage;

    public Test5(String massage) {
        setMassage(massage);
    }

    public static void main(String[] args) {
        var test5obj = new Test5("I'm at school");
        // test5obj.reverseOfString();
        test5obj.printReverseString();
    }

    private String getMassage() {
        return massage;
    }

    private void setMassage(String massage) {
        this.massage = massage;
    }

    public String reverseOfString() {
        String reverse = "";
        for (int i = getMassage().length() - 1; i >= 0; i--) {
            reverse += getMassage().charAt(i);
        }
        return reverse;
    }

    public void printReverseString() {
        System.out.println("The reverse of your message is: " + reverseOfString());
    }

}
