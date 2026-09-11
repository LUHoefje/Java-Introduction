import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* STRING & STRING METHODS */

        String name = "LUHoefje";
        String occupation = "Apprentice";
        occupation += "r";

        System.out.println("My name is " + name + " my occupation is " + occupation);

        String sentence = "Hello, how are you doing? Hello";
        System.out.println(sentence);

        // Upper case & Lower case
        System.out.println("Lower case: " + sentence.toLowerCase()); // All lower case
        System.out.println("Upper case: " + sentence.toUpperCase()); // All upper case

        // Contain
        System.out.println("Does it contain \"hello\": " + sentence.contains("hello"));

        // Replacing
        System.out.println(sentence.replace("Hello", "Howdy, Howdy"));

        // charAt
        System.out.println(sentence.charAt(8));

        System.out.println(sentence);


        System.out.println("---------------------------------------------------------");

        // Think back String Comparisons!
        System.out.println("What is your name");
        Scanner scanner = new Scanner(System.in);


    }
}