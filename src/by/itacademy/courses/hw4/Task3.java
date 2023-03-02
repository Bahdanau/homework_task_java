package by.itacademy.courses.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int factorial = 1;
        int i = 1;
        System.out.print(number + "!" + " = ");
        while (number >= i) {
            factorial *= i;
            System.out.print(i);
            if (i < number) {
                System.out.print(" * ");
            }
            ++i;
        }
        System.out.println("\nЗначение факториала: " + factorial);
    }
}

