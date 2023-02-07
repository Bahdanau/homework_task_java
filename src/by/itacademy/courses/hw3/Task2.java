package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number = in.nextInt();
        if (number % 2 != 0 && number > 0) {
            System.out.println("Number:" + number + " odd positive");
        } else if (number % 2 == 0 && number < 0) {
            System.out.println("Number:" + number + " even negative");
        } else
            System.out.println("The number did not fall into any category");
    }
}
