package by.itacademy.courses.hw7.task3;

public class Pears extends Fruit {
    private double price;
    private String name;

    public Pears(String name, double weight, double price) {
        super(weight);
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price * getWeight();

    }

    public String getName() {
        return name;
    }
}
