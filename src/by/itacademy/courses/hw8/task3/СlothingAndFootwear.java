package by.itacademy.courses.hw8.task3;

public abstract class СlothingAndFootwear {
    private String color;
    private String name;

    public СlothingAndFootwear(String names, String colors) {
        this.color = colors;
        this.name = names;

    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String setName(String names) {
        name = names;
        return names;
    }

    public void setColor(String colors) {
        this.color = colors;
    }
}
