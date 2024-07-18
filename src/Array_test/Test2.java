package Array_test;

import java.util.Random;

public class Test2 {

    private int numCount;
    private int charCount;
    private String code;

    public Test2() {
        // this.numCount =0;
        setNumCount(0);
        //this.charCount =0;
        setCharCount(0);
        // this.code = "";
        setCode("");
        generateRandomCodeOf6Characters();
    }

    private int getNumCount() {
        return numCount;
    }

    private void setNumCount(int numCount) {
        this.numCount = numCount;
    }

    private int getCharCount() {
        return charCount;
    }

    private void setCharCount(int charCount) {
        this.charCount = charCount;
    }

    private String getCode() {
        return code;
    }

    private void setCode(String code) {
        this.code = code;
    }

    private char generateRandomCharacters() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //abcdefghijklmnopqrstuvwxyz";
        var randomChar = new Random();
        if (randomChar.nextBoolean()) {
            str = str.toLowerCase();
        }
        return str.charAt(randomChar.nextInt(str.length()));
    }

    private int generateRandomNumbers() {
        var random = new Random();
        return random.nextInt(9);
    }

    public String generateRandomCodeOf6Characters() {
        // int numCount = 0;
        // int charCount = 0;
        // String code = "";
        while (getNumCount() < 3 || getCharCount() < 3) {
            var randomBoolean = new Random();
            boolean generate = randomBoolean.nextBoolean();
            if (generate && getNumCount() < 3) {
                setCode(getCode() + generateRandomNumbers());
                //numCount++;
                setNumCount(getNumCount() + 1);
            } else if (!generate && getCharCount() < 3) {
                //code += generateRandomCharacters();
                setCode(getCode() + generateRandomCharacters());
                // charCount++;
                setCharCount(getCharCount() + 1);
            }
        }
        //System.out.println(code);
        return getCode();

    }

    public void printRandomCodeOf6Characters() {
        System.out.println("The code generated is: " + getCode());
    }

}
