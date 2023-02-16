package by.itacademy.courses.hw5;

public class Person {
    public String fullName;
    public int age;

    public Person() {
    }

    public Person(String fullName1, int age1) {
        this.fullName = fullName1;
        this.age = age1;
    }


    public String getMove() {
        return fullName + " Движется вперед ";
    }

    public String getTalk() {
        return fullName + " говорит: Hello!!!";
    }
}

