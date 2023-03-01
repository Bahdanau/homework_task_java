package by.itacademy.courses.hw6;

public class Task6 {
    public static void main(String[] args) {
        String versionJava = "Versions:Java 5, Java 6, Java 7, Java 8, Java 12.";
        String regex = "[A-z]*:*\\s*[^Java\\s{1}\\d+]+,*\\.*\\s*";
        String[] strings = versionJava.split(regex);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}