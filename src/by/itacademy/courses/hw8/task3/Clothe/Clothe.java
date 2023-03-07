package by.itacademy.courses.hw8.task3.Clothe;

import by.itacademy.courses.hw8.task3.ClotheSize;
import by.itacademy.courses.hw8.task3.Color;
import by.itacademy.courses.hw8.task3.СlothingAndFootwear;

public abstract class Clothe extends СlothingAndFootwear {
    public String clotheSize;


    public Clothe(String colors, Color names, ClotheSize clotheSizes) {
        super(colors, String.valueOf(names));
        this.clotheSize = String.valueOf(clotheSizes);
    }

    public String getClotheSize() {
        return clotheSize;
    }


}

