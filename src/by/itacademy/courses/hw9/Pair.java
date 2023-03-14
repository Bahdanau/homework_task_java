package by.itacademy.courses.hw9;

public class Pair<T, V> {
    private T obj1;
    private V obj2;

    public Pair(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T returnValue1() {
        return obj1;
    }

    public V returnValue2() {
        return obj2;
    }

    public T swap1() {
        return (T) obj2;
    }

    public V swap2() {
        return (V) obj1;
    }

    public void newEnter(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;

    }

    public String toString() {
        return "\nПервое значение : " + obj1 + "\nВторое значение: " + obj2;
    }

}

