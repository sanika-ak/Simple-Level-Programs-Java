public class DataTypesDemo {
    public static void main(String[] args) {
        byte smallNumber = 127; // Ranges from -128 to 127
        short shortNumber = 32000; // Ranges from -32,768 to 32,767
        int integerNumber = 100000;
        long longNumber = 10000000000L; // For long numbers 'L' is attached to the number at last
        float floatNumber = 10.5f; // decimal values
        double doubleNumber = 99.99; // decimal values with high precesion
        char letter = 'A';
        boolean decision = true;
        String message = "Hello, Java!";

        // print values and its respective data type
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + shortNumber);
        System.out.println("Int value: " + integerNumber);
        System.out.println("Long value: " + longNumber);
        System.out.println("Float value: " + floatNumber);
        System.out.println("Double value: " + doubleNumber);
        System.out.println("Char value: " + letter);
        System.out.println("Boolean value: " + decision);
        System.out.println("String value: " + message);
        }
    }
}
