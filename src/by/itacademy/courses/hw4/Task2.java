package by.itacademy.courses.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int numberStatik1 = 0;
        int numberStatik2 = 1;
        while (number > 0) {
            numberStatik1 += number % 10;
            numberStatik2 *= number % 10;
            number = number / 10;
        }
        System.out.println("Сумма цифр: " + numberStatik1 + "\nПроизведение цифр числа: " + numberStatik2);
    }
}
