import java.util.Random;

public class SnakeAndLadder {
    //initializing start position
        int position = 0;

    /* This main method is used to call rollDice
     * Store the output of rollDice method
     */
    public static void main(String[] args) {
        SnakeAndLadder snakeLadder = new SnakeAndLadder();
        int diceValue = snakeLadder.rollDice();
    }

    /* This method is used to define constructor
     * generate random numbers between 1 and 6
     * return int This returns the random numbers
     */
    public int rollDice() {
        Random random = new Random();
        int dice = (random.nextInt (6) + 1);
        System.out.println("Die Roll Is : " + dice);
        return dice;
    }
}
