package Generics;

import java.util.ArrayList;

public class parametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenericMethod.getSecondElement(al1);
        System.out.println(a);


        ArrayList<String> al2 = new ArrayList<>();
        al2.add("ABC");
        al2.add("DEF");
        al2.add("GHI");
       String s = GenericMethod.getSecondElement(al2);
        System.out.println(s);
    }
}

class GenericMethod{
    public static <T> T getSecondElement(ArrayList<T>al){
return al.get(2);
    }
}