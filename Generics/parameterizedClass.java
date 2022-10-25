package Generics;

public class parameterizedClass {
    public static void main(String[] args) {
        info<String> info_str = new info<>("Value One");
        System.out.println("String value"+info_str);
        String s = info_str.getValue();

        info<Integer>info_int = new info<>(123);
        System.out.println("Integer value " + info_int);
        Integer i1 = info_int.getValue();
    }
}

class info <T>{
    private T value;
    public info(T value){
        this.value = value;
    }
    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}
