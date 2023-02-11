package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сторону треугольника №1: ");
        int long1 = in.nextInt();
        System.out.println("Введите сторону треугольника №3: ");
        int long2 = in.nextInt();
        System.out.println("Введите сторону треугольника №3: ");
        int long3 = in.nextInt();
        if (long1 <= long2 + long3) {
            if (long2 <= long1 + long3) {
                if (long3 <= long1 + long2) {
                    System.out.println("Треугольник со сторонами: " + long1 + ", " + long2 + ", " + long3 + " может существовать");
                } else {
                    System.out.println("Некоректные данные");
                }
            } else {
                System.out.println("Некоректные данные");
            }
        } else if (long2 <= long1 + long3) {
            if (long1 <= long2 + long3) {
                if (long3 <= long1 + long2) {
                    System.out.println("Треугольник со сторонами: " + long1 + ", " + long2 + ", " + long3 + " может существовать");
                } else {
                    System.out.println("Некоректные данные");
                }
            } else {
                System.out.println("Некоректные данные");
            }
        } else if (long3 <= long1 + long2) {
            if (long1 <= long2 + long3) {
                if (long2 <= long1 + long3) {
                    System.out.println("Треугольник со сторонами: " + long1 + ", " + long2 + ", " + long3 + " может существовать");
                } else {
                    System.out.println("Некоректные данные");
                }
            } else {
                System.out.println("Некоректные данные");
            }

        } else {
            System.out.println("Некоректные данные");
        }

    }
}