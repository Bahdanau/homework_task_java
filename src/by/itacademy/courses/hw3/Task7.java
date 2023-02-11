package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введте первое целое число: ");
        int number1 = in.nextInt();
        System.out.println("Введте второе целое число: ");
        int number2 = in.nextInt();
        int mulNumbor = number1 * number2;
        System.out.println("Каков результат умножения первого числа на второе?");
        int result = in.nextInt();
        if (result == mulNumbor) {
            System.out.println("Это правельный ответ, молодец!");
        } else {
            System.out.println("Это неправельный ответ, правельный ответ: " + mulNumbor);
        }
    }
}
