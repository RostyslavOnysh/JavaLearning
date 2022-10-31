package ArrayListMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        String [] ourArray = new String[]{"100","200","300"};
        List <String>ourList = new ArrayList<>(Arrays.asList(ourArray));
        System.out.println("Our Array : "+ourList);
        ourList.add("400");
        System.out.println("we can add new elements : "+ ourList);
    }
}
