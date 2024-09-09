package ArrayList;

public class ValidIPAddress {
    public static void main(String[] args) {
        String ip = "104.009.2200.61";
        String[] strs = ip.split("\\.");
        for (String word : strs) {
            // System.out.println(word);
            if (Integer.parseInt(word) > 255 || Integer.parseInt(word) < 0 || strs.length != 4) {
                System.out.println("Invalid IP");
                break;

            }


        }

    }
}