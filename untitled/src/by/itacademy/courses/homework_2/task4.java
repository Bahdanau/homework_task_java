package by.itacademy.courses.homework_2;

public class task4 {
    public static void main(String[] args) {
        byte nuberByte = 127;
        short numberShort = 32765;
        int numberInt = 2147483647;
        long numberLong = 21474836479l;
        float numberFloat = 80.7000005f;
        double numberDouble = 60.465454654559;
        char meaningchar = 0x1D;

        transformationByte(nuberByte, numberShort, numberInt, numberLong, numberDouble, numberFloat, meaningchar);
        transformationShort(nuberByte, numberShort, numberInt, numberLong, numberDouble, numberFloat, meaningchar);
        transformationInt(nuberByte, numberShort, numberInt, numberLong, numberDouble, numberFloat, meaningchar);
        transformationLong(nuberByte, numberShort, numberInt, numberLong, numberDouble, numberFloat, meaningchar);
        transformationFloat(nuberByte, numberShort, numberInt, numberLong, numberDouble, numberFloat, meaningchar);
        transformationDouble(nuberByte, numberShort, numberInt, numberLong, numberDouble, numberFloat, meaningchar);
        transformationChar(nuberByte, numberShort, numberInt, numberLong, numberDouble, numberFloat, meaningchar);
    }

    public static void transformationByte(byte numberByte, short numberShort, int numberInt, long numberLong,
                                          double numberDouble, float numberFloat, char meanigchar) {
        numberByte = numberByte;
        numberShort = (short) numberByte;
        numberInt = (int) numberByte;
        numberLong = (long) numberByte;
        numberFloat = (float) numberByte;
        numberDouble = (double) numberByte;
        meanigchar = (char) numberByte;
        System.out.println("Transformation byte in: " + "\nByte: " + numberByte + "\nShort: " + numberShort
                + "\nInt: " + numberInt + "\nLong: " + numberLong + "\nFloat: " + numberFloat + "\nDouble: " + numberDouble + "\nChar: " + meanigchar + "\n");
    }

    public static void transformationShort(byte numberByte, short numberShort, int numberInt, long numberLong,
                                           double numberDouble, float numberFloat, char meanigchar) {
        numberShort = numberShort;
        numberByte = (byte) numberShort;
        numberInt = (int) numberShort;
        numberLong = (long) numberShort;
        numberFloat = (float) numberShort;
        numberDouble = (double) numberShort;
        meanigchar = (char) numberByte;
        System.out.println("Transformation short in: " + "\nShort: " + numberShort + "\nByte: " + numberByte + "\nInt: " + numberInt +
                "\nLong: " + numberLong + "\nFloat: " + numberFloat + "\nDouble: " + numberDouble + "\nChar: " + meanigchar + "\n");
    }

    public static void transformationInt(byte numberByte, short numberShort, int numberInt, long numberLong,
                                         double numberDouble, float numberFloat, char meanigchar) {
        numberInt = numberInt;
        numberByte = (byte) numberInt;
        numberShort = (short) numberInt;
        numberLong = (long) numberInt;
        numberFloat = (float) numberInt;
        numberDouble = (double) numberInt;
        meanigchar = (char) numberInt;
        System.out.println("Transformation integer in: " + "\nInt: " + numberInt + "\nByte: " + numberByte + "\nShort: " + numberShort +
                "\nLong: " + numberLong + "\nFloat: " + numberFloat + "\nDouble: " + numberDouble + "\nChar: " + meanigchar + "\n");
    }

    public static void transformationLong(byte numberByte, short numberShort, int numberInt, long numberLong,
                                          double numberDouble, float numberFloat, char meanigchar) {
        numberLong = numberLong;
        numberByte = (byte) numberLong;
        numberShort = (short) numberLong;
        numberInt = (int) numberLong;
        numberFloat = (float) numberLong;
        numberDouble = (double) numberLong;
        meanigchar = (char) numberLong;
        System.out.println("Transformation long in: " + "\nLong: " + numberLong + "\nByte: " + numberByte + "\nShort: " + numberShort + "\nInt: " + numberInt
                + "\nFloat: " + numberFloat + "\nDouble: " + numberDouble + "\nChar: " + meanigchar + "\n");
    }

    public static void transformationFloat(byte numberByte, short numberShort, int numberInt, long numberLong,
                                           double numberDouble, float numberFloat, char meanigchar) {
        numberFloat = numberFloat;
        numberByte = (byte) numberFloat;
        numberShort = (short) numberFloat;
        numberInt = (int) numberFloat;
        numberLong = (long) numberFloat;
        numberDouble = (double) numberFloat;
        meanigchar = (char) numberFloat;
        System.out.println("Transformation float in: " + "\nFloat: " + numberFloat + "\nByte: " + numberByte + "\nShort: " + numberShort
                + "\nInt: " + numberInt + "\nLong: " + numberLong + "\nDouble: " + numberDouble + "\nChar: " + meanigchar + "\n");
    }

    public static void transformationDouble(byte numberByte, short numberShort, int numberInt, long numberLong,
                                            double numberDouble, float numberFloat, char meanigchar) {
        numberDouble = numberDouble;
        numberByte = (byte) numberFloat;
        numberShort = (short) numberFloat;
        numberInt = (int) numberFloat;
        numberLong = (long) numberFloat;
        numberFloat = (float) numberDouble;
        meanigchar = (char) numberFloat;
        System.out.println("Transformation double in: " + "\nDouble: " + numberDouble + "\nByte: " + numberByte + "\nShort: " + numberShort
                + "\nInt: " + numberInt + "\nLong: " + numberLong + "\nFloat: " + numberFloat + "\n");
    }

    public static void transformationChar(byte numberByte, short numberShort, int numberInt, long numberLong,
                                          double numberDouble, float numberFloat, char meanigchar) {
        meanigchar = meanigchar;
        numberByte = (byte) meanigchar;
        numberShort = (short) meanigchar;
        numberInt = (int) meanigchar;
        numberLong = (long) meanigchar;
        numberFloat = (float) meanigchar;
        numberDouble = (double) meanigchar;

        System.out.println("Transformation char in: " + "\nChar: " + meanigchar + "\nByte: " + numberByte + "\nShort: " + numberShort + "\nInt: "
                + numberInt + "\nLong: " + numberLong + "\nFloat: " + numberFloat + "\nDouble: " + numberDouble + "\nChar: " + meanigchar + "\n");
    }
}
