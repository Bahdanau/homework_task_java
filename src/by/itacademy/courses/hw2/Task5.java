package by.itacademy.courses.hw2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number = in.nextInt();
        withBranch(number);
        withoutBranching(number);

    }

    public static void withBranch(int number) {
        number = number;
        if (number % 2 == 0) {
            System.out.println("The remainder: 0");
        } else {
            System.out.println("The remainder: " + number % 2);
        }
    }

    public static void withoutBranching(int number) {
        number = number;
        System.out.println("The remainder: " + number % 2);

    }
}
