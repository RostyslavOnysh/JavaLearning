package Iterator;


import java.util.ArrayList;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");
        list.add("String 5");
        /*
        for (String value : list) {
            System.out.println(value);     // old example
        }
         */

        list.iterator().forEachRemaining(System.out::println);   // new example
    }
}
