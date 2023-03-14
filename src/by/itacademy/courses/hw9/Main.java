package by.itacademy.courses.hw9;

public class Main {
    public static void main(String[] args) {
        calculator();
        System.out.println();
        pair();

    }

    public static void calculator() {
        System.out.println("Сумма чисел :" + Calculator.sum(25, 31.5));
        System.out.println("Произведение чисел :" + Calculator.multiply(5, 39.5));
        System.out.println("Деление чисел :" + Calculator.divide(25, 337));
        System.out.println("Разность чисел :" + Calculator.subtraction(250, 156.5));
    }

    public static void pair() {
        Pair pair1 = new Pair<>(259, "object2");
        System.out.println("Значение первого элемента: " + pair1.returnValue1());
        System.out.println("Значение второго элемента: " + pair1.returnValue2());
        System.out.println("Поменяные:");
        System.out.println("Значение первого элемента: " + pair1.swap1());
        System.out.println("Значение второго элемента: " + pair1.swap2());
        pair1.newEnter("hello", 395);
        System.out.println("Значение: " + pair1.toString());

    }

}

