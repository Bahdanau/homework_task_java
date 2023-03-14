package by.itacademy.courses.hw8;


import by.itacademy.courses.hw8.task1.Food;
import by.itacademy.courses.hw8.task2.User;
import by.itacademy.courses.hw8.task3.Clothe.Clothe;
import by.itacademy.courses.hw8.task3.Clothe.Hoodie;

import by.itacademy.courses.hw8.task3.Clothe.Trousers;
import by.itacademy.courses.hw8.task3.ClotheSize;
import by.itacademy.courses.hw8.task3.Color;
import by.itacademy.courses.hw8.task3.ShoeSize;
import by.itacademy.courses.hw8.task3.Shoes.LowShoe;
import by.itacademy.courses.hw8.task3.Shoes.Shoes;
import by.itacademy.courses.hw8.task3.Shoes.Sneakers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cooking();
        System.out.println();
        user();
        System.out.println();
        shop();
    }

    public static void cooking() {
        Food charlotte = new Food("Класическая шарлотка");
        System.out.println();
        charlotte.prepare(() -> System.out.println("Классическая шарлотка. Важное сладкое блюдо советской и постсоветской истории." +
                "\nЛегкое, пышное тесто, максимум яблочной начинки — у шарлотки всегда был образ приятного, простого и при" +
                "\nэтом лакомого и диетического блюда. Яблоки настоятельно рекомендуем взять из кислых" +
                "\nсортов — вроде антоновки. Их можно класть как сырыми, так и предварительно слегка карамелизованнымина сковородке." +
                "\nИ сахара лучше не жалеть. Он магическим образом распределяется в нужном количестве в тесте," +
                "\nа излишки образуют сладкую корочку."));

    }

    public static void user() {
        User user = new User("artoha", "123asdasf456");
        User.Query query = user.new Query();
        query.printToLog();

    }

    public static void shop() {
        Scanner in = new Scanner(System.in);
        Hoodie hoodie1 = new Hoodie("Hoodie", Color.BLUE, ClotheSize.L);
        Hoodie hoodie2 = new Hoodie("Hoodie", Color.RED, ClotheSize.XXL);
        Hoodie hoodie3 = new Hoodie("Hoodie", Color.GREEN, ClotheSize.L);
        Hoodie[] basketHoodie = new Hoodie[3];
        basketHoodie[0] = hoodie1;
        basketHoodie[1] = hoodie2;
        basketHoodie[2] = hoodie3;
        Trousers trousers1 = new Trousers("Trousers", Color.VIOLET, ClotheSize.S);
        Trousers trousers2 = new Trousers("Trousers", Color.GREEN, ClotheSize.XL);
        Trousers trousers3 = new Trousers("Trousers", Color.BLUE, ClotheSize.S);
        Trousers[] basketTrousers = new Trousers[3];
        basketTrousers[0] = trousers1;
        basketTrousers[1] = trousers2;
        basketTrousers[2] = trousers3;
        LowShoe lowShoe1 = new LowShoe("Low shoe", Color.VIOLET, ShoeSize.FORTY);
        LowShoe lowShoe2 = new LowShoe("Low shoe", Color.WHITE, ShoeSize.FORTYTWO);
        LowShoe lowShoe3 = new LowShoe("Low shoe", Color.BLACK, ShoeSize.THIRTYEIGHT);
        LowShoe[] basketLowShoe = new LowShoe[3];
        basketLowShoe[0] = lowShoe1;
        basketLowShoe[1] = lowShoe2;
        basketLowShoe[2] = lowShoe3;
        Sneakers sneakers1 = new Sneakers("Sneakers", Color.GREEN, ShoeSize.FORTY);
        Sneakers sneakers2 = new Sneakers("Sneakers", Color.BLUE, ShoeSize.THIRTYSEVEN);
        Sneakers sneakers3 = new Sneakers("Sneakers", Color.VIOLET, ShoeSize.THIRTYFIVE);
        Sneakers[] basketSneakers = new Sneakers[3];
        basketSneakers[0] = sneakers1;
        basketSneakers[1] = sneakers2;
        basketSneakers[2] = sneakers3;
        System.out.println("Желаете узнать что на складе? Если да напишите 1:");
        int number = in.nextInt();
        if (number == 1) {
            System.out.println("Одежда в наличии: ");
            for (Clothe stock : basketHoodie) {
                System.out.println(stock.toString());
            }
            for (Clothe stock : basketTrousers) {
                System.out.println(stock.toString());
            }
            System.out.println("Обувь в наличии: ");
            for (Shoes stock : basketLowShoe) {
                System.out.println(stock.toString());
            }
            for (Shoes stock : basketSneakers) {
                System.out.println(stock.toString());
            }
        }
        System.out.println();
        System.out.println("Если хотите найти товар по цвету и размеру нажмите 1\nЕсли хотите получить все товары по размеру нажмите 2");

        int choice1 = in.nextInt();
        int choice = 0;
        String names = "";
        if (choice1 == 1) {
            System.out.println("Напишите какой товар вы хотите Худи: 1, Брюки: 2, Полуботинки: 3,Кросовки: 4 ");
            choice = in.nextInt();

        } else if (choice1 == 2) {
            System.out.println("Напишите какой товар вы хотите Худи: 1, Брюки: 2, Полуботинки: 3,Кросовки: 4 ");
            choice = in.nextInt();
        }


        switch (choice) {
            case 1:
                names = "Hoodie";
                break;
            case 2:
                names = "Trousers";
                break;
            case 3:
                names = "Low shoe";
                break;
            case 4:
                names = "Sneakers";
                break;
            default:
                System.out.println("Неверное значение");
        }

        if (choice1 == 1) {
            if (choice == 1) {
                System.out.println("Вы выбрали: " + names);
                System.out.println("Какой цвет хотите: " + Arrays.toString(Color.values()));
                System.out.print("Напишите нужный цвет: ");
                String a = in.next();
                Color color = Color.valueOf(a);
                System.out.println("Какой размер вам нужен:" + Arrays.toString(ClotheSize.values()));
                System.out.print("Напишите нужный размер: ");
                String b = in.next();
                ClotheSize clotheSizes = ClotheSize.valueOf(b);
                Hoodie hoodie0 = new Hoodie(names, color, clotheSizes);

                for (Hoodie stock : basketHoodie) {

                    if (hoodie0.equals(stock)) {
                        System.out.println("Эта вещь есть на складе");
                        System.out.println("Если будете покупать введите 1");
                        int number2 = in.nextInt();
                        System.out.println();
                        if (number2 == 1) {
                            System.out.println("Товар " + stock + " добавлен в корзину.");
                        } else {
                            System.out.println("Жалко заходите ещё");
                        }
                    }
                }
            } else if (choice == 2) {
                System.out.println("Вы выбрали: " + names);
                System.out.println("Какой цвет хотите: " + Arrays.toString(Color.values()));
                System.out.print("Напишите нужный цвет: ");
                String a = in.next();
                Color color = Color.valueOf(a);
                System.out.println("Какой размер ван нужен:" + Arrays.toString(ClotheSize.values()));
                System.out.print("Напишите нужный размер: ");
                String b = in.next();
                ClotheSize clotheSizes = ClotheSize.valueOf(b);
                Trousers trousers0 = new Trousers(names, color, clotheSizes);
                for (Trousers stock : basketTrousers) {
                    if (trousers0.equals(stock)) {
                        System.out.println("Эта вещь есть на складе");
                        System.out.println("Если будете покупать введите 1");
                        int number2 = in.nextInt();
                        System.out.println();
                        if (number2 == 1) {
                            System.out.println("Товар " + stock + " добавлен в корзину.");
                        } else {
                            System.out.println("Жалко заходите ещё");
                        }
                    }
                }
            } else if (choice == 3) {
                System.out.println("Вы выбрали: " + names);
                System.out.println("Какой цвет хотите: " + Arrays.toString(Color.values()));
                System.out.print("Напишите нужный цвет: ");
                String a = in.next();
                Color color = Color.valueOf(a);
                System.out.println("Какой размер ван нужен:" + Arrays.toString(ShoeSize.values()));
                System.out.print("Напишите нужный размер: ");
                String b = in.next();
                ShoeSize shoeSizes = ShoeSize.valueOf(b);
                LowShoe lowShoe0 = new LowShoe(names, color, shoeSizes);
                for (LowShoe stock : basketLowShoe) {
                    if (lowShoe0.equals(stock)) {
                        System.out.println("Эта вещь есть на складе");
                        System.out.println("Если будете покупать введите 1");
                        int number2 = in.nextInt();
                        System.out.println();
                        if (number2 == 1) {
                            System.out.println("Товар " + stock + " добавлен в корзину.");
                        } else {
                            System.out.println("Жалко заходите ещё");
                        }
                    }
                }
            } else if (choice == 4) {
                System.out.println("Вы выбрали: " + names);
                System.out.println("Какой цвет хотите: " + Arrays.toString(Color.values()));
                System.out.print("Напишите нужный цвет: ");
                String a = in.next();
                Color color = Color.valueOf(a);
                System.out.println("Какой размер ван нужен:" + Arrays.toString(ShoeSize.values()));
                System.out.print("Напишите нужный размер: ");
                String b = in.next();
                ShoeSize shoeSizes = ShoeSize.valueOf(b);
                Sneakers sneakers0 = new Sneakers(names, color, shoeSizes);
                for (Sneakers stock : basketSneakers) {
                    if (sneakers0.equals(stock)) {
                        System.out.println("Эта вещь есть на складе");
                        System.out.println("Если будете покупать введите 1");
                        int number2 = in.nextInt();
                        System.out.println();
                        if (number2 == 1) {
                            System.out.println("Товар " + stock + " добавлен в корзину.");
                        } else {
                            System.out.println("Жалко заходите ещё");
                        }
                    }
                }
            } else {
                System.out.println("Введена неверная иформация");
            }
        } else if (choice1 == 2) {
            if (choice == 1 || choice == 2) {
                System.out.println("Какой размер ван нужен:" + Arrays.toString(ClotheSize.values()));
                System.out.println("Введите размер");
                String k = in.next();
                ClotheSize clotheSize = ClotheSize.valueOf(k);
                Trousers trousers10 = new Trousers("000", Color.GREEN, clotheSize);
                System.out.println("Одежда в наличии: ");
                for (Clothe stock : basketHoodie) {
                    if (trousers10.clotheSize.equals(stock.clotheSize)) {
                        System.out.println(stock);
                    }
                }
                for (Clothe stock : basketTrousers) {
                    if (trousers10.clotheSize.equals(stock.clotheSize)) {
                        System.out.println(stock);
                    }
                }
            } else if (choice == 3 || choice == 4) {
                System.out.println("Какой размер ван нужен:" + Arrays.toString(ShoeSize.values()));
                System.out.println("Введите размер ");
                String k = in.next();
                ShoeSize shoeSizes = ShoeSize.valueOf(k);
                Sneakers sneakers10 = new Sneakers("000", Color.GREEN, shoeSizes);

                System.out.println("Обувь в наличии: ");
                for (Shoes stock : basketLowShoe) {
                    if (sneakers10.shoeSize.equals(stock.shoeSize)) {
                        System.out.println(stock);
                    }
                }
                for (Shoes stock : basketSneakers) {
                    if (sneakers10.shoeSize.equals(stock.shoeSize)) {
                        System.out.println(stock);
                    }
                }
            }
        }


    }


}




