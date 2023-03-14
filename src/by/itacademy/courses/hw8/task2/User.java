package by.itacademy.courses.hw8.task2;

public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином: \"" + login + "\" и паролем: \"" + password + "\" отправил запрос");
        }
    }
}
