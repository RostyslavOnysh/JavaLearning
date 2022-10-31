package asListMethod;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class asListMethod {
    public static void main(String[] args) {
        String ourArray[] = new String[]{"100","200","300"};
        List<String> OurList = Arrays.asList(ourArray);
        System.out.println(OurList);
    }
}
