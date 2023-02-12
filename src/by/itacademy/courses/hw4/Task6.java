package by.itacademy.courses.hw4;

public class Task6 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{-1, 5, -9, 8, 6, -9, 55, -45, 4, -85};
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] < 0) {
                pos++;
            } else {
                neg++;
            }
        }
        int[] myArray2 = new int[pos];
        int[] myArray3 = new int[neg];
        pos = 0;
        neg = 0;
        for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] < 0) {
                myArray2[pos] = myArray1[i];
                pos++;
            } else if (myArray1[i] >= 0) {
                myArray3[neg] = myArray1[i];
                neg++;
            }
        }
        System.out.println("\nОтрицательные числа: ");
        for (int number : myArray2) {
            System.out.print(number + ", ");
        }
        System.out.println("\nПоложительные  числа: ");
        for (int number : myArray3) {
            System.out.print(number + ", ");
        }
    }
}
