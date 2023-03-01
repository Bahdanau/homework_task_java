package by.itacademy.courses.hw7.task4;

public class Flowers {
    private String name;
    private String color;
    private double value;
    private int floweringTime;
    private int quantity;


    public Flowers(String name1, String color1, double value1, int floweringTime1, int quantity1) {
        this.name = name1;
        this.color = color1;
        this.value = value1;
        this.floweringTime = floweringTime1;
        this.quantity = quantity1;

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getValue() {
        return value * quantity;
    }

    public int getFloweringTime() {
        return floweringTime;
    }

    public int getQuantity() {
        return quantity;
    }
}
