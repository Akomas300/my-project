package Java_Projets.Day8;

public class ClassB {
    public static void main(String[] args) {
        int count = 0;
        String str = "Hello and Welcome To TekSchool ))))))000998877";
        String newStr = (str.replaceAll("[^A-z]", ""));
      /*  for (int i = 0; i < newStr.length(); i++) {
            // String newStr1 =newStr.charAt(i);
            count++;
        }*/
        // System.out.println(count);
        System.out.println(newStr);
    }
}