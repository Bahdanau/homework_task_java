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
        transformationShort(numberShort, numberInt, numberLong, numberDouble, numberFloat);
        transformationInt(numberInt, numberLong, numberDouble, numberFloat);
        transformationLong(numberLong, numberDouble, numberFloat);
        transformationFloat(numberDouble, numberFloat);
        transformationDouble(numberInt, numberLong, numberDouble, numberFloat);
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
        System.out.println("Transformation byte in: " + "\nByte: " + numberByte + "\n" + "Short: " + numberShort + "\n"
                + "Int: " + numberInt + "\n" + "Long: " + numberLong + "\n" + "Float: " + numberFloat + "\n"
                + "Double: " + numberDouble + "\n" + "Char: " + meanigchar + "\n");
    }

    public static void transformationShort(short numberShort, int numberInt, long numberLong, double numberDouble,
                                           float numberFloat) {
        numberShort = numberShort;
        numberInt = (int) numberShort;
        numberLong = (long) numberShort;
        numberFloat = (float) numberShort;
        numberDouble = (double) numberShort;
        System.out.println("Transformation short in: " + "\n" + "Short: " + numberShort + "\n" + "Int: " + numberInt + "\n"
                + "Long: " + numberLong + "\n" + "Float: " + numberFloat + "\n" + "Double: " + numberDouble + "\n");
    }

    public static void transformationInt(int numberInt, long numberLong, double numberDouble, float numberFloat) {
        numberInt = numberInt;
        numberLong = (long) numberInt;
        numberFloat = (float) numberInt;
        numberDouble = (double) numberInt;
        System.out.println("Transformation integer in: " + "\n" + "Int: " + numberInt + "\n" + "Long: " + numberLong
                + "\n" + "Float: " + numberFloat + "\n" + "Double: " + numberDouble + "\n");
    }

    public static void transformationLong(long numberLong, double numberDouble, float numberFloat) {
        numberLong = numberLong;
        numberFloat = (float) numberLong;
        numberDouble = (double) numberLong;
        System.out.println("Transformation long in: " + "\n" + "Long: " + numberLong + "\n" + "Float: "
                + numberFloat + "\n" + "Double: " + numberDouble + "\n");
    }

    public static void transformationFloat(double numberDouble, float numberFloat) {
        numberFloat = numberFloat;
        numberDouble = (double) numberFloat;
        System.out.println("Transformation float in: " + "\n" + "Float: " + numberFloat + "\n" + "Double: "
                + numberDouble + "\n");
    }

    public static void transformationDouble(int numberInt, long numberLong, double numberDouble, float numberFloat) {
        numberDouble = numberDouble;
        numberLong = (long) numberDouble;
        numberInt = (int) numberDouble;
        numberFloat = (float) numberDouble;
        System.out.println("Transformation double in: " + "\n" + "Float: " + numberFloat + "\n" + "Double: "
                + numberDouble + "\n");
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

        System.out.println("Transformation char in: " + "\n" + "Char: " + meanigchar + "\nByte: " + numberByte + "\n" +
                "Short: " + numberShort + "\n" + "Int: " + numberInt + "\n" + "Long: " + numberLong + "\n"
                + "Float: " + numberFloat + "\n" + "Double: " + numberDouble + "\n");
    }
}
