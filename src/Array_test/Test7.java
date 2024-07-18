package Array_test;

public class Test7 {
    public static void main(String[] args) {
        String name = "Nasiba";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
        
        StringBuilder stringBuilder = new StringBuilder(name);
        System.out.println(stringBuilder.reverse());

        StringBuffer stringBuffer = new StringBuffer(name);
        System.out.println(stringBuffer.reverse());
    }


}
