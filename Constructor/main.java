package Constructor;

public class main {
    public static void main(String[] args) {
Cat CatNameConstruktor = new Cat("Myrzik");
SayCatService sayCatService = new SayCatService();
sayCatService.sayMethod(CatNameConstruktor,"Hello");

Cat Bax = new Cat("Barsik");
sayCatService.sayMethod(Bax,"Hello i`m second cat named Barsik");
Cat Varvara = new Cat("Varvara");
sayCatService.sayMethod(Varvara,"Hello i1m third cat named Varvara");

SayCatService.sayMeow();
        System.out.println(SayCatService.HelloFromStat);
    }
}
