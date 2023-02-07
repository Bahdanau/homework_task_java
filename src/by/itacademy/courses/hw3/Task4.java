package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 1;
        if (a < b && a < c) {
            if (c < b) {
                System.out.println(a + ", " + c + ", " + b);
            } else {
                System.out.println(a + ", " + b + ", " + c);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + ", " + a + ", " + c);
            } else {
                System.out.println(b + ", " + c + ", " + a);
            }
        } else if (c < a && c < b) {
            if (a < b) {
                System.out.println(c + ", " + a + ", " + b);
            } else {
                System.out.println(c + ", " + b + ", " + a);
            }
        }
    }
}
