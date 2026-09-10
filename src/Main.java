public class Main {
    public static void main(String[] args) {
        /* ASSIGNMENT OPERATORS */

        //Assignment =
        int mana = 100;
        System.out.println("Mana: " + mana);
        // int x = 1000;
        // mana = x;

        // ADDITION +=
        mana += 20; // mana = mana + 20
        System.out.println("Mana: " + mana);
        mana++; // Increment
        System.out.println("Mana: " + mana);


        // SUBTRACTION
        mana--; // DECREMENT
        System.out.println("Mana: " + mana);
        mana -= 60;
        System.out.println("Mana: " + mana);


        // MULTIPLY *=
        mana*= 2;
        System.out.println("Mana: " + mana);

        // DIVIDE
        mana /= 4;
        System.out.println("Mana: " + mana);

        // MODULO
        mana %= 2;
        System.out.println("Mana: " + mana);
    }
}