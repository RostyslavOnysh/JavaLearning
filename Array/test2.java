package Array;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int []array1 ={1,9,3,-8,0,5,4,1};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
