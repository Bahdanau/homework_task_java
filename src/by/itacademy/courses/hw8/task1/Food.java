package by.itacademy.courses.hw8.task1;

public class Food implements Cookable {
    private String dish;
    private String cooking;

    public Food(String dish) {
        this.dish = dish;

    }

    @Override
    public void cook() {

    }

    public void prepare(Cookable c) {
        c.cook();
    }

}
