package Week5;

import java.util.HashMap;

public class MapClassRunner {
    public static void main(String[] args) {
        String message = "Used to refer to static methods from" +
                " a class ClassName::staticMethodName " +
                "Instance method from a specific " +
                "instance Refer to an instance method using " +
                "a reference to the supplied object " +
                "instance::instanceMethodName Instance method " +
                "from the Class type Invoke the instance method " +
                "on a reference to an object supplied by the context" +
                " ClassName::instanceMethodName Constructor Reference" +
                " to a constructor";
//        var mapClassObj = new MapClass(message);

        HashMap<String, Integer> r = MapClass.countNumberOfEachWordFindInAString(message, false);
        System.out.println("***************************************************");
//        mapClassObj.countTheNumberOfEachWordInAParagraph();
    }
}
