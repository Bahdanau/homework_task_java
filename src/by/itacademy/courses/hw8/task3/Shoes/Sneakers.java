package by.itacademy.courses.hw8.task3.Shoes;

import by.itacademy.courses.hw8.task3.Color;
import by.itacademy.courses.hw8.task3.ShoeSize;

public class Sneakers extends Shoes {
    public Sneakers(String names, Color color, ShoeSize shoeSizes) {
        super(names, color, shoeSizes);
    }

    public String toString() {
        return "Название: " + getName() + " Цвет: " + getColor() + " Размер: " + getShoeSize();
    }

    public boolean equals(Object obj) {
        Shoes shoes = (Shoes) obj;
        if (this.getName() == shoes.getName() && this.getColor() == shoes.getColor() && this.getShoeSize() == shoes.getShoeSize()) {

            return true;
        }

        return false;
    }
}
