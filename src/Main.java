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
        boolean isLUHoefje = name.equals("LUHoefje"); // .equals for strings

        System.out.println("Is your name LUHoefje? " + isLUHoefje);


        /* LOGIC */
        // Addition and "subtraction" for booleans

        // (BOOLEAN logic BOOLEAN) ==> BOOLEAN

        boolean passTest1 = true;
        boolean passTest2 = true;
        boolean hasHonors = passTest1 && passTest2;

        boolean hasPickaxe = true;
        int durability = 5;
        int neededDurability = 9;

        boolean canMine3x3Area = (hasPickaxe && (durability >= neededDurability)) || isCreative;

        System.out.println("You can mine a 3x3 area: " + canMine3x3Area);

        /* DRINKING AGE EXAMPLE */
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Put in true or false, are you from Europe?");
        boolean isEuropean = scanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean isAmerican = !isEuropean;
        boolean couldDrinkInEu = age >= euDrinkingAge;
        boolean couldDrinkInUs = age >= usDrinkingAge;

        boolean canPersonDrinkAlcohol = (isEuropean && couldDrinkInEu) || (isAmerican && couldDrinkInUs);
        System.out.println("Can you drink? " + canPersonDrinkAlcohol);
    }
}