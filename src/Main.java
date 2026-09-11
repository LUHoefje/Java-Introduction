import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Exercise 1a: Basic calculator */

        // Ask which operation the user wants to use
        System.out.println("--------------------------------------------------");
        System.out.println("What operation do you want to do?");
        System.out.println("+ - * /");
        System.out.println("--------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        String isOperation = scanner.next();


        /*---------------------------------------------------------------------------------------*/
        // Ask which numbers the user wants to use

        // Number 1
        System.out.println("Select your first number: ");
        System.out.println("--------------------------------------------------");
        int number1 = scanner.nextInt();
        System.out.println("Selected number: " + number1);

        // Number 2
        System.out.println("Select your second number: ");
        System.out.println("--------------------------------------------------");
        int number2 = scanner.nextInt();
        System.out.println("Selected number: " + number2);


        /*---------------------------------------------------------------------------------------*/

        // This is where the result will be calculated
        int result = 0;

        switch (isOperation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    System.err.println("Error: Cannot divide by zero!");
                    return;
                }
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid input: " + isOperation);
                return;
        }


        /*---------------------------------------------------------------------------------------*/
        // Output the result
        System.out.println("--------------------------------------------------");
        System.out.println("Result: " + number1 + " " + isOperation + " " + number2 + " = " + result);


        /* Exercise 1b: Basic Resource Miner */
    }
}