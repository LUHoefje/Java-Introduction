import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* INPUT & OUTPUT */

        /* OUTPUT */
        System.out.println("Hello world! This is my first output");

        // values - Printing values
        int life = 42;
        System.out.println(life);

        // value and string - string concetation
        int grade = 85;
        System.out.println("your grade is " + grade);


        /* INPUT */
        System.out.println("Input a number"); // asks for a number in the CLI
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // int requires it to be a number
        System.out.println("You just typed " + number);

        String input = scanner.next();
        System.out.println("You just typed (string): " + input);

    }
}