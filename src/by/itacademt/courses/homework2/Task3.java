package by.itacademt.courses.homework2;

public class Task3 {
    public static void main(String[] args) {
        int timeseconds = 2944629;
        int numberWeekStatik = 60 * 60 * 24 * 7;
        int numberDayStatik = 60 * 60 * 24;
        int timeHoursStatik = 60 * 60;
        int numberWeek = timeseconds / numberWeekStatik;
        int numberDay = (timeseconds % numberWeekStatik) / numberDayStatik;
        int timeHours = ((timeseconds % numberWeekStatik) % numberDayStatik) / timeHoursStatik;
        int timeMinutes = (((timeseconds % numberWeekStatik) % numberDayStatik) % timeHoursStatik) / 60;
        int timeSeconds = (((timeseconds % numberWeekStatik) % numberDayStatik) % timeHoursStatik) % 60;

        System.out.println("Number of weeks: " + numberWeek + "\nNumber of day: " + numberDay + "\nNumber of hours: "
                + timeHours + "\nNumber of minutes: " + timeMinutes + "\nNumber of second: " + timeSeconds);

    }
}
