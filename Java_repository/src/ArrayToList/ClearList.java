package ArrayToList;

import java.util.ArrayList;
import java.util.List;

public class ClearList {
    public static void main(String[] args) {
        String OurArray[] = new String[]{"123", "456", "789"};
        List<String> ourList = new ArrayList<>();
        for (int i = 0; i < OurArray.length; i++) {
            ourList.add(OurArray[i]);
        }
        System.out.println(ourList);
    }
}
