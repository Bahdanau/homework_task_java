package by.itacademy.courses.hw6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст, в котором поменяются первое самое большое слово и последнее самое маленькое");
        String text = in.nextLine();
        String regex = "\\s*[\\s!\\.,-]\\s*";

        String[] strings = text.split(regex);

        int longMax = 0;
        int longMin = strings[0].length();

        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < strings.length; i++) {

            if (longMax < strings[i].length()) {
                longMax = strings[i].length();
                indexMax = i;

            } else if (longMin >= strings[i].length()) {
                longMin = strings[i].length();
                indexMin = i;
            }

        }

        changeIndex(text, indexMax, indexMin);
    }

    static void changeIndex(String text, int indexMax, int indexMin) {
        String[] strings2 = text.split("\\s+");

        String indexMaxLast = strings2[indexMax];
        strings2[indexMax] = strings2[indexMin];
        strings2[indexMin] = indexMaxLast;

        for (String word : strings2) {
            System.out.print(word + " ");
        }

    }
}

