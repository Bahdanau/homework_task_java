package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 59");
        int number = in.nextInt();
        if (number > 0 && number < 60) {
            if (number < 15) {
                System.out.println("First half hour");
            } else if (number < 30) {
                System.out.println("Second half hour");
            } else if (number < 45) {
                System.out.println("Third half hour");
            } else if (number < 60) {
                System.out.println("Fourth half hour");
            }
        } else {
            System.out.println("Invalid number, enter an integer from 1 to 59");
        }
    }
}
