package by.itacademy.courses.hw7;

import by.itacademy.courses.hw7.task1.GraduateStudent;
import by.itacademy.courses.hw7.task1.Student;
import by.itacademy.courses.hw7.task2.Converter;
import by.itacademy.courses.hw7.task2.Fahrenheit;
import by.itacademy.courses.hw7.task2.Kelvin;
import by.itacademy.courses.hw7.task3.Apple;
import by.itacademy.courses.hw7.task3.Apricot;
import by.itacademy.courses.hw7.task3.Fruit;
import by.itacademy.courses.hw7.task3.Pears;
import by.itacademy.courses.hw7.task4.Chamomile;
import by.itacademy.courses.hw7.task4.Flowers;
import by.itacademy.courses.hw7.task4.Lilies;
import by.itacademy.courses.hw7.task4.Roses;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        learningPeople();
        System.out.println();
        convertorInfo();
        System.out.println();
        fruitIfo();
        System.out.println();
        basketflowers();


    }

    public static void learningPeople() {
        Student arturBahdanau = new Student("Artur", "Bahdanau", 3, "141 ОиТВПОМ", 5);
        Student ruslanZarecki = new Student("Ruslan", "Zarecki", 4, "151 ОиТВПОМ", 5);
        Student nikitaDyckov = new Student("Nikita", "Dyckov", 1, "121 ОиТВПОМ", 3);
        Student vitaliySinkevich = new Student("Vitaliy", "Sinkevich", 2, "131 ОиТВПОМ", 2);
        GraduateStudent alexBahdanau = new GraduateStudent("Alex", "Bahdanau", 2, "35 ТМ", 5, "Литье под давлением");
        GraduateStudent yuraMelnikov = new GraduateStudent("Yura", "Melnikikov", 1, "34 ТМ", 4, "Уменьшение трения в подшипниках");
        arturBahdanau.sumScholarship();
        ruslanZarecki.sumScholarship();
        nikitaDyckov.sumScholarship();
        vitaliySinkevich.sumScholarship();
        alexBahdanau.sumScholarship();
        yuraMelnikov.sumScholarship();
    }

    public static void convertorInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите температуру в градусах цельсия: ");
        double x = in.nextDouble();
        Converter kelvin = new Kelvin(x);
        Converter fahrenheit = new Fahrenheit(x);
        fahrenheit.converter();
        kelvin.converter();
    }

    public static void fruitIfo() {
        Apple apple = new Apple("Apples", 3.5, 5);
        Pears pears = new Pears("Pearses", 6.7, 10.9);
        Apricot apricot = new Apricot("Aprocots", 15, 40);
        Fruit[] basket = new Fruit[3];
        basket[0] = apple;
        basket[1] = pears;
        basket[2] = apricot;
        double basketValue = 0;
        double basketWeight = 0;
        for (Fruit basket0 : basket) {
            basketValue = basketValue + basket0.getPrice();
            basketWeight = basketWeight + basket0.getWeight();
            String name = basket0.getName();
            System.out.print("Фрукт: " + basket0.getName() + " цена: " + basket0.getPrice() + "BYN за " + basket0.getWeight() + "кг. ");
            apricot.printManufacturerInfo();
        }
        System.out.println("Общий вес фруктов: " + basketWeight + "кг и его стоимость: " + basketValue + "руб.");

    }

    public static void basketflowers() {
        Lilies lilies1 = new Lilies("Лилия Боландера", "Красный", 3.6, 48, 3);
        Lilies lilies2 = new Lilies("Лилия белоснежная", "Белый", 4.6, 62, 7);
        Roses roses1 = new Roses("Розы Грандифлора", "Розовый", 10.0, 24, 4);
        Roses roses2 = new Roses("Миниатюрные розы", "Желтый", 10.0, 34, 8);
        Chamomile chamomile1 = new Chamomile("Ромашка золотистая", "Желтый", 2.5, 50, 2);
        Chamomile chamomile2 = new Chamomile("Ромашка аптечная", "Белый", 2.5, 5, 5);
        Flowers[] basketfrower = new Flowers[6];
        basketfrower[0] = lilies1;
        basketfrower[1] = lilies2;
        basketfrower[2] = roses1;
        basketfrower[3] = roses2;
        basketfrower[4] = chamomile1;
        basketfrower[5] = chamomile2;
        String allFlowers = "";
        String allColor = "";
        int floweringTimes = 0;
        double price = 0;
        int i = 0;
        for (Flowers flowers : basketfrower) {
            price = price + flowers.getValue();

            if (i <= 5) {
                allFlowers = allFlowers.concat(flowers.getName() + " " + flowers.getQuantity() + "шт." + ", ");

            } else {
                allFlowers = allFlowers.concat(flowers.getName() + " " + flowers.getQuantity() + "шт" + ".");
            }
            if (floweringTimes < flowers.getFloweringTime()) {
                floweringTimes = flowers.getFloweringTime();
            }
            if (i <= 5) {
                allColor = allColor.concat(flowers.getColor() + " ");
            }


            i++;
        }
        System.out.println("Букет состоит из: " + allFlowers + "\nЕго стоимость :" + price + "руб");
        System.out.println("Время жизни последенего цветка в букете: " + floweringTimes + " часов");
        String[] stringArray = allColor.split(" ");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(stringArray));
        String[] outputArray = new String[set.size()];
        set.toArray(outputArray);
        System.out.println("Букет состоит из цветов: " + Arrays.toString(outputArray));


    }
}


