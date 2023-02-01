package by.itacademy.courses.homework_2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("The remainder: 0");
        } else {
            System.out.println("The remainder: " + number % 2);
        }
    }
}
