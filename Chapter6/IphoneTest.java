package Chapter6;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Red", 500_000);
        iphone.setColor("blue");
        iphone.setPrice(6000);

        System.out.printf("My %s iphone is %d", iphone.getColor(), Iphone.getPrice());
    }
}
