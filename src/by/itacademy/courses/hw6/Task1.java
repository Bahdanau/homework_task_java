package by.itacademy.courses.hw6;

public class Task1 {
    public static void main(String[] args) {
        String a = "     I    write        irr           string!     ";
        a = a.replaceAll(" \\s+", " ");
        a = a.trim();

        System.out.println(a);
    }
}

