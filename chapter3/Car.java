package chapter3;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public double getDiscount1(){
        double discount1 = price - (price * 0.05);
        return discount1;
    }

    public double getDiscount2(){
        double discount2 = price - (price * 0.07);
        return discount2;
    }
}
