package by.itacademy.courses.hw8.task3.Clothe;

import by.itacademy.courses.hw8.task3.ClotheSize;
import by.itacademy.courses.hw8.task3.Color;

public class Hoodie extends Clothe {
    public Hoodie(String names, Color colors, ClotheSize clotheSizes) {
        super(names, colors, clotheSizes);

    }

    public String toString() {
        return "Название: " + getName() + " Цвет: " + getColor() + " Размер: " + getClotheSize();
    }

    public boolean equals(Object obj) {
        Hoodie hoodie = (Hoodie) obj;
        if (this.getName() == hoodie.getName() && this.getColor() == hoodie.getColor() && this.getClotheSize() == hoodie.clotheSize) {

            return true;
        }
        return false;
    }


}
