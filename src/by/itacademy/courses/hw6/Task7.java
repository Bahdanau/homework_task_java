package by.itacademy.courses.hw6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите e-mail для проверки: ");
        String email = in.next();
        String regex = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        if (Pattern.matches(regex, email)) {
            System.out.println("Вы можете использовать: "+email);
        }
        else{
            System.out.println("Данное сочетание символов не может быть e-mail");

        }


    }
}
