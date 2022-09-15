package Chapter6;

public class Iphone {
    private String color;
    private static int price;

    public Iphone(String color, int price) {
        this.color = color;
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static void setPrice(int price) {
        Iphone.price = price;
    }
    public static int getPrice() {
        return price;
    }



}
