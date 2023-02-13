package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int dayWeek = in.nextInt();
        methodSwitch(dayWeek);
        methodIf(dayWeek);
    }

    public static void methodSwitch(int dayWeek) {
        switch (dayWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6, 7:
                System.out.println("Weeknd");
                break;
            default:
                System.out.println("Wrong number");
        }
    }

    public static void methodIf(int dayWeek) {
        if (dayWeek == 1) {
            System.out.println("Monday");
        } else if (dayWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayWeek == 4) {
            System.out.println("Thursday");
        } else if (dayWeek == 5) {
            System.out.println("Friday");
        } else if (dayWeek == 6 || dayWeek == 7) {
            System.out.println("Weeknd");
        } else {
            System.out.println("Wrong number");
        }
    }
}
