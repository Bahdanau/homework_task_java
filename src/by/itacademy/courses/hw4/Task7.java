package by.itacademy.courses.hw4;

public class Task7 {
    public static void main(String[] args) {
        int[] myArray1 = new int[20];
        int j = 0;
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = (int) (Math.random() * (20));
            j++;
        }
        System.out.println("Массив с случайными элементами: ");
        for (int number : myArray1) {
            System.out.print(number + " ");
        }
        System.out.println();
        int[] myArray2 = new int[j];
        for (int i = 0; i < myArray1.length; i++) {
            j--;
            myArray2[j] = myArray1[i];
        }
        System.out.println("Массив с перевернутыми случайными элементами: ");
        for (int number : myArray2) {
            System.out.print(number + " ");
        }
    }
}
