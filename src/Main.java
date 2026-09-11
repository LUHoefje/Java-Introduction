import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* IF & SWITCH */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much health you have?");
        int health = scanner.nextInt();
        boolean isAlive = health > 0;

        // check if you are alive with the given argument
        if(isAlive) {
            System.out.println("You are still alive");
        } else {
            System.out.println("You are not alive");
        }


        // checks if you passed with honors or just passed with the given argument
        System.out.println("How many points did you have in the exam?");
        int points = scanner.nextInt();

        if(points >= 100) {
            System.out.println("Passed with honors");
        } else if(points >= 50) {
            System.out.println("You passed");
        } else {
            System.out.println("You failed");
        }


        /* SWITCH */

        System.out.println("Give me an number between 0 and 5");
        int studentId = scanner.nextInt();
        switch (studentId) {
            case 0:
                System.out.println("Student Sarah has id 0");
                break;
            case 1:
                System.out.println("Student Mara has id 1");
                break;
            case 2:
                System.out.println("Student Richard has id 2");
                break;
            case 3:
                System.out.println("Student John has id 3");
                break;
            case 4:
                System.out.println("Student Ludwig has id 4");
                break;
            case 5:
                System.out.println("Student Nano id 5");
                break;
            default:
                System.out.println("ERROR: Student with id " + studentId + " not found!");
    }



    }
}