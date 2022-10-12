package ArrayList;

import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        Car c = new Car();
        list.add(c);
        Student st = new Student();
        list.add(st);
        list.add(new StringBuilder("Good Bye"));
    ArrayList<String> listString = new ArrayList<String>();
    listString.add("Bye");



    }
}


class Car {
}

class Student {
}