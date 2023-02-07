package by.itacademy.courses.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number №1:");
        int number1 = in.nextInt();
        System.out.print("Enter number №2:");
        int number2 = in.nextInt();
        int sumNumber = number1 + number2;
        int mulNumber = number1 * number2;
        int lastNumber = sumNumber+mulNumber;
        System.out.println("Sum of numbers:" + lastNumber);
    }
}
