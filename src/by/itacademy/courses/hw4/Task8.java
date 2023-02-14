package by.itacademy.courses.hw4;

public class Task8 {

    public static void main(String[] args) {
        int quantityTicket = 0;
        for (int i = 1; i < 1000000; i++) {
            int num1 = i / 100000 % 10;
            int num2 = i / 10000 % 10;
            int num3 = i / 1000 % 10;
            int num4 = i / 100 % 10;
            int num5 = i / 10 % 10;
            int num6 = i / 1 % 10;
            if (num1 + num2 + num3 == num4 + num5 + num6) {
                quantityTicket++;
            }
        }
        System.out.println("Количество счастливых билетов в одном рулоне: " + quantityTicket);
    }
}
