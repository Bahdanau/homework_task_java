package by.itacademy.courses.homework_2;

public class task3 {
    public static void main(String[] args) {
        int timeseconds = 2944629;
        int numberWeek = timeseconds / (60 * 60 * 24 * 7);
        int numberDay = (timeseconds % (60 * 60 * 24 * 7)) / (60 * 60 * 24);
        int timeHours = ((timeseconds % (60 * 60 * 24 * 7)) % (60 * 60 * 24)) / (60 * 60);
        int timeMinutes = (((timeseconds % (60 * 60 * 24 * 7)) % (60 * 60 * 24)) % (60 * 60)) / 60;
        int timeSeconds = (((timeseconds % (60 * 60 * 24 * 7)) % (60 * 60 * 24)) % (60 * 60)) % 60;

        System.out.println("Number of weeks: " + numberWeek + "\nNumber of day: " + numberDay + "\nNumber of hours: "
                + timeHours + "\nNumber of minutes: " + timeMinutes + "\nNumber of second: " + timeSeconds);

    }
}
