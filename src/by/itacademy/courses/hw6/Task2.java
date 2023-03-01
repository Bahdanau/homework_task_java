package by.itacademy.courses.hw6;
import java.util.Scanner;
public class Task2 {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фразы с имеющимися цифрами:");
        String text = in.nextLine();
        String regex = "([a-z_-]*\\.)*\\s*[^0-9]+";
        String[] strings = text.split(regex);
        String text1 = "";
        int longText1 = 0;
        String s;
        for (int i = 0; strings.length > i; i++) {
            String text2 = strings[i];
            int longText2 = text2.length();

            if (longText2 > longText1) {
                longText1 = longText2;
                text1 = text2;
            }
        }
        System.out.println("Наибольшее количество идущих подряд цифер: " + longText1 + " цифры: " + text1);

    }
}

