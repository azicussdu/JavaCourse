package om.introduct.javacourse.basics;

import java.util.Scanner;

/**
 * Topic: Loops (for, while, do-while) and break / continue
 */
public class Loops {

    public static void main(String[] args) {

        // ============================================================
        // 1. for loop
        // ============================================================

        // for (start; condition; step)
        // Use for when you know how many times the loop should run.

        // From 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // From 10 to 1 (i-- decreases by 1)
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Step 2: i += 2 means i = i + 2
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Step 3
        for (int i = 3; i <= 30; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ============================================================
        // 2. while loop
        // ============================================================

        // while runs as long as the condition is true.
        // Use it when you do NOT know in advance how many times it will run.
        // Don't forget to change the variable, otherwise the loop never ends!
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // ============================================================
        // 3. break and continue
        // ============================================================

        // break: stops the loop completely.
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.print(i + " ");   // 1 2 3 4 5
        }
        System.out.println();

        // continue: skips the rest of this step and goes to the next one.
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;                // skip even numbers
            }
            System.out.print(i + " ");   // 1 3 5 7 9
        }
        System.out.println();

        // ============================================================
        // 4. while (true) with break and continue
        // ============================================================

        // while (true) is an endless loop. We exit it with break.
        // Read numbers until the user enters 0.
        // Negative numbers are skipped with continue.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (0 to stop):");
        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;                   // user entered 0: stop the loop
            }
            if (number < 0) {
                System.out.println("Negative number skipped");
                continue;                // go to the next number
            }

            System.out.println("You entered: " + number);
            sum += number;
        }
        System.out.println("Sum of positive numbers: " + sum);

        // ============================================================
        // 5. do - while loop
        // ============================================================

        // do-while checks the condition AFTER the body,
        // so the body always runs at least once.
        int x = 10;
        do {
            System.out.println("x = " + x);   // prints once, even though 10 < 5 is false
            x++;
        } while (x < 5);

        scanner.close();
    }
}
