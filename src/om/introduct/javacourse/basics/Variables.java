package om.introduct.javacourse.basics;

/**
 * Topic: Variables and Data Types in Java
 *
 * Java has 8 primitive types:
 *   byte, short, int, long  - whole numbers
 *   float, double           - decimal numbers
 *   char                    - a single character
 *   boolean                 - true or false
 *
 * String is NOT a primitive type. It is a class (an object),
 * but it is used so often that we learn it together with primitives.
 */
public class Variables {
    public static void main(String[] args) {

        // ============================================================
        // 1. WHOLE NUMBERS: byte, short, int, long
        // ============================================================

        // byte: 8 bits (1 byte) of memory.
        // Range: -128 to 127. Used when memory really matters (files, network data).
        byte age = 25;
        System.out.println("byte:  " + age);

        // short: 16 bits (2 bytes) of memory.
        // Range: -32,768 to 32,767. Rarely used in practice.
        short year = 2026;
        System.out.println("short: " + year);

        // int: 32 bits (4 bytes) of memory.
        // Range: about -2.1 billion to 2.1 billion.
        // This is the DEFAULT type for whole numbers. Use it in most cases.
        // Tip: underscores make big numbers easier to read (1_000_000 = 1000000).
        int population = 5_000_000;
        System.out.println("int:   " + population);

        // long: 64 bits (8 bytes) of memory.
        // Range: about -9.2 quintillion to 9.2 quintillion.
        // Use it when int is too small. Put the letter L at the end of the number.
        long worldPopulation = 8_100_000_000L;
        System.out.println("long:  " + worldPopulation);

        System.out.println();


        // ============================================================
        // 2. DECIMAL NUMBERS: float vs double
        // ============================================================

        // float: 32 bits (4 bytes), about 6-7 correct digits.
        // Put the letter f at the end of the number, otherwise Java treats it as double.
        float floatResult = 10f / 3;
        System.out.println("float:  10 / 3 = " + floatResult);   // 3.3333333

        // double: 64 bits (8 bytes), about 15-16 correct digits.
        // This is the DEFAULT type for decimal numbers. Use it in most cases.
        double doubleResult = 10.0 / 3;
        System.out.println("double: 10 / 3 = " + doubleResult);  // 3.3333333333333335

        // Integer division: if BOTH numbers are int, the result is int.
        // The decimal part is simply cut off (not rounded).
        int intResult = 10 / 3;
        System.out.println("int:    10 / 3 = " + intResult);     // 3

        System.out.println();

        // ============================================================
        // 3. CHARACTERS: char
        // ============================================================

        // char: 16 bits (2 bytes). Stores exactly ONE character.
        // Use single quotes ' ' (double quotes " " are for String).
        char letter = 'A';
        char digit = '7';
        char symbol = '$';
        System.out.println("char: " + letter + " " + digit + " " + symbol);

        System.out.println();

        // ============================================================
        // 4. TRUE / FALSE: boolean
        // ============================================================

        // boolean: can store only two values: true or false.
        // Used in conditions (if) and loops (while, for).
        boolean isStudent = true;
        boolean hasCar = false;
        System.out.println("isStudent: " + isStudent);
        System.out.println("hasCar:    " + hasCar);

        // Logical operators: && (AND), || (OR), ! (NOT)
        System.out.println("isStudent && hasCar: " + (isStudent && hasCar)); // false
        System.out.println("isStudent || hasCar: " + (isStudent || hasCar)); // true
        System.out.println("!hasCar: " + (!hasCar));                          // true

        System.out.println();

        // ============================================================
        // 5. TEXT: String
        // ============================================================

        // String: a sequence of characters. Use double quotes " ".
        // String starts with a capital letter because it is a class, not a primitive.
        String name = "Ahmed";
        String city = "Muscat";
        System.out.println("String: " + name + " from " + city);

        // Useful String methods
        System.out.println("Length:      " + name.length());        // 5
        System.out.println("Upper case:  " + name.toUpperCase());   // AHMED
        System.out.println("First char:  " + name.charAt(0));       // A (index starts at 0)
        System.out.println("Contains 'hm': " + name.contains("hm")); // true

        System.out.println();
    }
}