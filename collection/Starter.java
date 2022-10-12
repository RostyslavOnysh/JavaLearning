package collection;

public class Starter {
    public static void main(String[] args) {
        MyArrayList emp = new MyArrayList();
        emp.add("Dima");
        emp.add("tanya");
        emp.add("Danya");
        emp.add("Ivan");
        emp.add("Alona");
        emp.add("Ros");
        emp.add("buba");
        emp.remove(3);
        emp.remove("Alona");
        for (int i = 0; i < emp.getSize(); i++) {
            System.out.println(emp.get(i));
        }
    }
}
