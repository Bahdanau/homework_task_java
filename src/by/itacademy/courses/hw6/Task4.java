package by.itacademy.courses.hw6;
public class Task4 {

    static public void main(String args[]) {

        int number1 = 3, number2 = 56;
        int sum = number1 + number2;
        int difference = number1 - number2;
        int multiplication = number1 * number2;

        StringBuilder sumNumbers = new StringBuilder(number1 + "+" + number2 + "=" + sum);
        StringBuilder differenceNumbers = new StringBuilder(number1 + "-" + number2 + "=" + difference);
        StringBuilder multiplicationNumbers = new StringBuilder(number1 + "*" + number2 + "=" + multiplication);

        sumNumbers.replace(4, 6, " равно ");
        differenceNumbers.replace(4, 6, " равно ");
        multiplicationNumbers.replace(4, 6, " равно ");

        System.out.println(sumNumbers + "\n" + differenceNumbers + "\n" + multiplicationNumbers);
    }
}








