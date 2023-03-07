package by.itacademy.courses.hw8.task3.Clothe;

import by.itacademy.courses.hw8.task3.ClotheSize;
import by.itacademy.courses.hw8.task3.Color;

public class Trousers extends Clothe {
    public Trousers(String names, Color colors, ClotheSize clotheSizes) {
        super(names, colors, clotheSizes);

    }

    public String toString() {
        return "Название: " + getName() + " Цвет: " + getColor() + " Размер: " + getClotheSize();
    }

    public boolean equals(Object obj) {
        Trousers trousers = (Trousers) obj;
        if (this.getName() == trousers.getName() && this.getColor() == trousers.getColor() && this.getClotheSize() == trousers.clotheSize) {

            return true;
        }

        return false;
    }
}
