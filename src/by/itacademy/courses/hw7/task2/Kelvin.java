package by.itacademy.courses.hw7.task2;

public class Kelvin implements Converter {
    double celsius;

    public Kelvin(double celsius) {
        this.celsius = celsius;
    }

    public void converter() {
        System.out.println("В Кельвинах это: " + (celsius + 273.15));
    }

}
