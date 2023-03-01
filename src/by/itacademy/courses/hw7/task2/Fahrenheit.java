package by.itacademy.courses.hw7.task2;

public class Fahrenheit implements Converter {
    public double celsius;

    public Fahrenheit(double celsius) {
        this.celsius = celsius;

    }

    public void converter() {
        System.out.println("В Фаренгейтах это: " + (celsius * (9.0 / 5.0) + 32.0));
    }


}
