import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*  Errors */

        /* Compiler Error's */
        // Errors that are shown before you run the program

        // int x = 0.0; // Incompatible type
        // int x = 0; // x is already defined

        // }} too many closing curly brackets!

        // int z = 0 // Error: ; expected


        /* Runtime Error's */
        // Errors that happen during the program

        // float y = 1 / 0; // Exception: Divide by zero


        // Exception: NullPointerException
        // String text = null;
        // System.out.println("My text is: " + text);

        // int length = text.length();
        // System.out.println("The length of the text is: " + length);


        // FAIL LOUDLY! --> Something to fix
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter anything but a number, that's gonna throw an error!");

        int number = scanner.nextInt();
        System.out.println("you just typed: " + number);

    }
}