public class Main {
    public static void main(String[] args) {
        /* INTEGERS & MATH */

        int a = 100;
        int b = 200;

        /* ADDITION */
        int sum = a + b;
        System.out.println("Sum:" + sum);

        sum = 50;
        System.out.println("Sum:" + sum); // different answer as we changed the variable sum


        /* SUBTRACTION */
        int sub = a - b;
        System.out.println("Subtraction: " + sub);

        /* MULTIPLICATION */
        int multi = a * b;
        System.out.println("Multiplication: " + multi);

        /* DIVISION */
        int division = a / b;
        System.out.println("Division: " + division); // will always display 0

        double x = 100;
        double y = 200;
        double doubleDivision = x / y;
        System.out.println("Division: " + doubleDivision); // this will not display 0

        // No division by 0!

        /* REMAINDER (MODULO) */
        int remainder = 100 % 2; // = 0 means it is an even number | = 1 means it is an uneven number
        System.out.println("Remainder of 100 / 2: " + remainder);

        remainder = 100 % 3;
        System.out.println("Remainder of 100 / 3 : " + remainder);

        /* MATH METHODS */
        System.out.println("Rounding: " + Math.round(6.4));         // Output: 6
        System.out.println("Rounding down: " + Math.floor(6.4));    // Output: 6
        System.out.println("Rounding up: " + Math.ceil(6.4));       // Output: 7
        System.out.println("Exponent : " + Math.pow(2, 3));         // Output: 2^3 = 8

        // More "Math Methods"
        // Math.


        // "RANDOM" Numbers
        System.out.println("Random number between 0 - 10: " + Math.round(Math.random() * 10));
        System.out.println("Random number between 0 - 10: " + Math.random() * 10);
        System.out.println("Random number between 0 - 20: " + Math.round(Math.random() * 20));

    }
}