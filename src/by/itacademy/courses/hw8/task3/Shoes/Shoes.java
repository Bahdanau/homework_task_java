package by.itacademy.courses.hw8.task3.Shoes;

import by.itacademy.courses.hw8.task3.Color;
import by.itacademy.courses.hw8.task3.ShoeSize;
import by.itacademy.courses.hw8.task3.СlothingAndFootwear;

public abstract class Shoes extends СlothingAndFootwear {
    public final String shoeSize;

    public Shoes(String names, Color color, ShoeSize shoeSizes) {
        super(names, String.valueOf(color));
        this.shoeSize = String.valueOf(shoeSizes);
    }

    public String getShoeSize() {
        return shoeSize;
    }

}
