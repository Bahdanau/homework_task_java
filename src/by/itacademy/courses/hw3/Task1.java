package by.itacademy.courses.hw3;

public class Task1 {
    public static void main(String[] args) {
        int number1 = 500;
        Integer number3 = 15;
        Integer number4 = new Integer(20);
        Integer number5 = number1;
        Integer number8 = new Integer(number1);
        System.out.println("Autoboxing: " + number5 + ", " + number8 + "\nAutounboxing: " + number3 + ", " + number4);
    }
}
