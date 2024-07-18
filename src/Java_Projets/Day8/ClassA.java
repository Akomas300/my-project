package Java_Projets.Day8;

public class ClassA extends ClassB {
    public static void main(String[] args) {
        int[] array = new int[3];
        int numberOfThis = 0;
        int numberOfThat = 0;
        int numberOfTest = 0;
        String str = "this is a this test which that this test is not this";
        String[] words = str.split(" ");
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + ";");

            if (words[i].equals("this")) numberOfThis++;
            else if (words[i].equals("that")) numberOfThat++;
            else if (words[i].equals("test")) numberOfTest++;
        }


        System.out.println(numberOfThat + " " + numberOfTest + " " + numberOfThis);
        array[0] = numberOfTest;
        array[1] = numberOfThat;

    }
}
