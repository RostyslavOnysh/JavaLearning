package Array;

public class test3 {
    public static int[] sortirowka(int[] array){
        int a;
        for (int i = 0; i < array.length; i++) {
            int min=array[i];
            int index = i;
            for (int j = i+1; j <array.length ; j++) {
if (array[j] < min){
    min = array[j];
    index = j;
}
            }
if (i!=index){
    a = array[i];
    array[i]=min;
    array[index]=a;
}
        }
        return array;
    }


    public static void main(String[] args) {
        int []array = {6,34,7,9,-4,2,7,-7};
        sortirowka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
