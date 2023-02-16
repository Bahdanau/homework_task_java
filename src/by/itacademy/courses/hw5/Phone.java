package by.itacademy.courses.hw5;

public class Phone {
    public String number;
    public String model;
    public int weight;

    public Phone() {

    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;

    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит: " + name);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String message, String... numbers) {
        for (String number : numbers) {
            System.out.println(message + number);

        }

    }
}