package by.itacademy.courses.hw4;
public class Task4 {
    public static void main(String[] args) {
        int[] myArray = new int[]{0, 46, 7, 1, 54};
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > myArray[indexOfMax]) {
                indexOfMax = i;
            } else if (myArray[i] < myArray[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println("Индекс минимального значения в массиве: " + indexOfMin + " Его значение: " + myArray[indexOfMin] +
                "\nИндекс максимального значения в массиве: " + indexOfMax + " Его значение: " + myArray[indexOfMax]);
    }
}




