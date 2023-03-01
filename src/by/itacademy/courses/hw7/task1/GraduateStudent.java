package by.itacademy.courses.hw7.task1;

public class GraduateStudent {

    private String name;
    private String surname;
    private int courseNumber;
    private String grupName;
    private int averageRating;
    private String scientificWork;

    public GraduateStudent(String name, String surname, int courseNumber, String grupName, int averageRating, String scientificWork) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.grupName = grupName;
        this.averageRating = averageRating;
        this.scientificWork = scientificWork;
    }

    public void sumScholarship() {
        if (averageRating == 5) {
            System.out.print("\nФ.И.О: " + name + " " + surname + ", Курс: " + courseNumber + ", Название группы: " + grupName + ", Средняя оценка: " + averageRating + ", Научная работа: " + scientificWork + ", Стипендия: 200");
        } else {
            System.out.print("\nФ.И.О: " + name + " " + surname + ", Курс: " + courseNumber + ", Название группы: " + grupName + ", Средняя оценка: " + averageRating + ", Научная работа: " + scientificWork + ", Стипендия: 180");
        }
    }
}




