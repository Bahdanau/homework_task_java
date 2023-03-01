package by.itacademy.courses.hw6;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String text = "Object-oriented programming is a programming language model organized " +
                "around objects rather than \"actions\" and data rather than logic. Object-oriented " +
                "programming blabla. Object-oriented programming bla. Object-oriented programming lalala";

        Pattern pattern = Pattern.compile("Object-oriented programming", Pattern.CASE_INSENSITIVE);
        String[] strings = text.split("\\.");

        for (int i = 0; strings.length > i; i++) {
            if (i % 2 != 0) {
                strings[i] = strings[i].replaceAll(pattern.pattern(), "OOP");
            }
        }
        StringBuilder textBuilder = new StringBuilder();
        for (String string : strings) {
            textBuilder.append(string + ".");
        }
        System.out.print(textBuilder);


    }
}

