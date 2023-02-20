package by.itacademy.courses.hw4;

public class Task5 {
    public static void main(String[] args) {
        method1();
        method2();
    }
    public static void method1() {
        int[] myArray = new int[]{97, 45, 7, 100, 54, 67, 54, 406, 52, 2};
        int indexOfMin = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0) {
                if (myArray[i] < myArray[indexOfMin]) {
                    indexOfMin = i;
                }
            }
        }
        System.out.println("Индекс минимального значения в массиве методом 1: " + indexOfMin + " Его значение: " + myArray[indexOfMin]);
    }

    public static void method2() {
        int[] myArray = new int[]{97, 45, 7, 100, 54, 67, 54, 406, 52, 2};
        int indexOfMin = 0;
        for (int i = 1; i < myArray.length; i = i + 2) {
            if (i % 2 != 0) {
                if (myArray[i] < myArray[indexOfMin]) {
                    indexOfMin = i;
                }
            }
        }
        System.out.println("Индекс минимального значения в массиве методом 2: " + indexOfMin + " Его значение: " + myArray[indexOfMin]);
    }
}

