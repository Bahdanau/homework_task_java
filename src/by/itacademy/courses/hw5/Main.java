package by.itacademy.courses.hw5;

public class Main {
    public static void main(String[] args) {
        personMethod();
        System.out.println();
        phoneMethod();
    }

    private static void personMethod() {
        Person Artur = new Person("Artur Bahdanau", 27);

        Person Alex = new Person();
        Alex.fullName = "Alex Bahdanau";
        Alex.age = 56;

        System.out.println(Artur.getMove());
        System.out.println(Artur.getTalk());

        System.out.println(Alex.getMove());
        System.out.println(Alex.getTalk());
    }

    private static void phoneMethod() {
        Phone iPhone = new Phone();
        iPhone.number = "+3758000000";
        iPhone.model = "10 pro max";
        iPhone.weight = 250;

        Phone Samsung = new Phone("+375xxxxxxxx9", "s8", 250);

        Phone Xiaomi = new Phone("+375447733189", "Redmi note 9 Pro");

        Phone missedMessages = new Phone();

        System.out.println(iPhone.getNumber());
        iPhone.receiveCall("Nikita", iPhone.number);
        System.out.println(Samsung.getNumber());
        Samsung.receiveCall("Ruslan", Samsung.number);
        System.out.println(Xiaomi.getNumber());
        Xiaomi.receiveCall("Artur", Xiaomi.number);
        System.out.println();


        missedMessages.sendMessage("Я перезвоню позже", " +375447733189", " +375xxxxxxxx9", " +3758000000");


    }
}
