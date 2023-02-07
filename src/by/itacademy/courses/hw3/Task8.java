package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int timeseconds = (int) (Math.random() * (28801 - 0) + 0);
        int result = timeseconds / 60 / 60;
        if (result >= 5 && result < 8) {
            System.out.println("Петров осталось: " + timeseconds+" секунд");
            System.out.println("Осталось " + result + " часов");
        } else if (result >= 2 && result < 5) {
            System.out.println("Петров осталось: " + timeseconds+" секунд");
            System.out.println("Осталось " + result + " часа");

        } else if (result >= 1 && result <= 2) {
            System.out.println("Петров осталось: " + timeseconds+" секунд");
            System.out.println("Осталось " + result + " час");

        } else {
            System.out.println("Петров осталось: " + timeseconds+" секунд");
            System.out.println("Осталось менее часа");
        }

    }
}
