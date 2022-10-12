package Constructor;

public class SayCatService {

    public static String HelloFromStat ="Hello from static";

    public static void sayMeow(){
        System.out.println("meow");
    }
    public void sayMethod(Cat cat,String message){
        System.out.println("Youy called SayCatMethod : ");
        String catName = cat.getName();
        System.out.println(ConcatNameAndMessage(catName,message));
    }


    private String ConcatNameAndMessage(String name,String message){
        return name + ": " + message;
    }



}

