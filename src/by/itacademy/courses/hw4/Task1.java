package by.itacademy.courses.hw4;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Таблица умножение от 1 до 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                int mulTabl = i * j;
                System.out.print(i + " * " + j + " = " + mulTabl + ";  ");
            }
        }
    }
}

