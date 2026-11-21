package om.introduct.javacourse.basics;

/**
 * Topic: Conditions (if, else if, else, switch) and logical operators
 */
public class Conditions {

    public static void main(String[] args) {

        // ============================================================
        // 1. if
        // ============================================================

        // Code inside if runs only when the condition is true.
        int temperature = 35;
        if (temperature > 30) {
            System.out.println("It is hot today");
        }

        // ============================================================
        // 2. if - else
        // ============================================================

        // else runs when the condition is false. One of the two blocks always runs.
        int age = 16;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are under 18");
        }

        // ============================================================
        // 3. if - else if - else
        // ============================================================

        // Use it when you need to check several conditions.
        // Java checks them from top to bottom and runs ONLY the first true block.
        // else at the end is optional: it runs if no condition is true.
        int score = 78;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // ============================================================
        // 4. switch
        // ============================================================

        // switch compares ONE variable with exact values (case).
        // Works with int, char, String (and some other types).
        // break stops the switch. Without break, the next case also runs!
        // default runs if no case matches (like else).
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }

        // Several values in one case: separate them with commas.
        String month = "Jul";
        switch (month) {
            case "Dec", "Jan", "Feb":
                System.out.println("Winter");
                break;
            case "Mar", "Apr", "May":
                System.out.println("Spring");
                break;
            case "Jun", "Jul", "Aug":
                System.out.println("Summer");
                break;
            default:
                System.out.println("Autumn");
        }

        // ============================================================
        // 5. Logical operators: && (AND), || (OR), ! (NOT)
        // ============================================================

        // && (AND): true only if BOTH conditions are true.
        int userAge = 20;
        boolean hasTicket = true;
        if (userAge >= 18 && hasTicket) {
            System.out.println("You can enter");
        }

        // || (OR): true if AT LEAST ONE condition is true.
        String today = "Friday";
        if (today.equals("Friday") || today.equals("Saturday")) {
            System.out.println("It is the weekend");
        }

        // ! (NOT): turns true into false and false into true.
        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("No umbrella needed");
        }

        // Operators can be combined. Use brackets to make the order clear.
        int number = 15;
        if ((number > 0 && number < 100) && (number % 2 != 0)) {
            System.out.println(number + " is an odd number between 1 and 99");
        }
    }
}