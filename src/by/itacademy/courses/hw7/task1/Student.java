package by.itacademy.courses.hw7.task1;

public class Student {
    private String name;
    private String surname;
    private int courseNumber;
    private String grupName;
    private int averageRating;

    public Student(String name, String surname, int courseNumber, String grupName, int averageRating) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.grupName = grupName;
        this.averageRating = averageRating;

    }

    public void sumScholarship() {
        if (averageRating == 5) {
            System.out.print("\nФ.И.О: " + name + " " + surname + ", Курс: " + courseNumber + ", Название группы: " + grupName + ", Средняя оценка: " + averageRating + ", Стипендия: 100");
        } else {
            System.out.print("\nФ.И.О: " + name + " " + surname + ", Курс: " + courseNumber + ", Название группы: " + grupName + ", Средняя оценка: " + averageRating + ", Стипендия: 80");
        }
    }
}
