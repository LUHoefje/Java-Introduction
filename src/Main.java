import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* BOOLEANS & LOGIC */

        // Booleans are either true or false
        boolean isSurvival = true;
        System.out.println("Player is in Survival: " + isSurvival);
        boolean isAdventure = false;
        System.out.println("Player is in Adventure: " + isAdventure);

        boolean isCreative = false;
        System.out.println("Player is in creative: " + isCreative);


        /* COMPARISON (< <= >= > == !=) */
        int points = 80;
        int pointsForPassing = 55;
        boolean hasPassedTest = points >= pointsForPassing;
        System.out.println("Passed: "+ hasPassedTest);

        int health = 10;
        boolean isAlive = health > 0;
        System.out.println("Player is alive: " + isAlive);

        // VARIABLE/VALUE comparison VARIABlE/VALUE
        //int + int ==> int

        // BEWARE of STRINGS
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean isLUHoefje = name == "LUHoefje"



    }
}