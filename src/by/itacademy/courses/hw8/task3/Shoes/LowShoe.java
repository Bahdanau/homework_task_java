package by.itacademy.courses.hw8.task3.Shoes;

import by.itacademy.courses.hw8.task3.Clothe.Hoodie;
import by.itacademy.courses.hw8.task3.Color;
import by.itacademy.courses.hw8.task3.ShoeSize;

public class LowShoe extends Shoes {
    public LowShoe(String names, Color color, ShoeSize shoeSizes) {
        super(names, color, shoeSizes);
    }

    public String toString() {
        return "Название: " + getName() + " Цвет: " + getColor() + " Размер: " + getShoeSize();
    }

    public boolean equals(Object obj) {
        LowShoe lowShoe = (LowShoe) obj;
        return this.getName() == lowShoe.getName() && this.getColor() == lowShoe.getColor() && this.getShoeSize() == lowShoe.getShoeSize();
    }
}
