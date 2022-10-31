package SortAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class ClassicSorting {
    public static void main(String[] args) {
        Integer array_ascending_sort[] = {5, 8, 2, 9, 1, 4};
        Arrays.sort(array_ascending_sort);
        System.out.println("ascending order : "+Arrays.toString(array_ascending_sort));
        // this array was sorted by ascending method


        Integer array_decreasing_sort[] = {5, 8, 2, 9, 1, 4};
        Arrays.sort(array_decreasing_sort);
        Arrays.sort(array_decreasing_sort, Collections.reverseOrder());
        System.out.println("descending order : "+Arrays.toString(array_decreasing_sort));
        // this array was sorted in descending order
    }
}
