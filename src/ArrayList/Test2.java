package ArrayList;

import java.util.ArrayList;

public class Test2 {
    public static <integer> void main(String[] args) {
        int m1 = 2;
        int m2 = 5;
        m1 = (m1 + m2) - (m2 = m1);
        System.out.println(m1);
        System.out.println(m2);
        int m3 = 6;
        int m4 = 10;
        m3 = m3 + m4;
        m4 = m3 - m4;
        m3 = m3 - m4;
        System.out.println(m3 + " " + m4);
        var numbers = new ArrayList<integer>();
        

    }
}
