import java.util.Random;

public class SnakeAndLadder {
    //constant
    final static int WIN_POSITION = 100;
    //variables
    int position = 0;
    int positionCheck = 0;

    /* This main method is used to call rollDice
     * Store the output of rollDice method
     */
    public static void main(String[] args) {
        SnakeAndLadder snakeLadder = new SnakeAndLadder();
        snakeLadder.playerOption();
    }

    /* This method is used to define constructor
     * generate random numbers between 1 and 6
     * return int This returns the random numbers
     */
    public int rollDice() {
        Random random = new Random();
        int dice = (random.nextInt(6) + 1);
        System.out.println("Die Roll Is : " + dice);
        return dice;
    }

    /* This method is used to check for no play, snake or ladder and reaches winning position 100
     * while loop to check if player reached winning position
     * create instance of random class
     * initializing dice to rollDice
     * using random function to create three random options 0, 1 and 2
     * print option 0, 1 or 2
     * assign them to no play, ladder and snake
     * if Ladder, Player moves forward with dice roll number
     * if Snake, Player moves backward with dice roll number
     * make sure not finish game till player reaches at exact position 100
     * Player will start again if start position is negative or zero
     * at last print the Players position and winning message
     */
    public void playerOption() {
        while (position < WIN_POSITION) {
            Random random = new Random();
            int dice = rollDice();
            int option = random.nextInt(3);
            System.out.println("Player Option Is : " + option);
            System.out.println("0.No Play 1.Ladder 2.Snake");
            switch (option) {
                case 1:
                    if ((position + dice) > WIN_POSITION) {
                        position = WIN_POSITION;
                    } else {
                        position += dice;
                    }
                    System.out.println("Ladder Is At : " + position);
                    break;
                case 2:
                    position -= dice;
                    if ((position - dice) < positionCheck) {
                        position = positionCheck;
                    }
                    System.out.println("Snake Is At : " + position);
                    break;
                default:
                    System.out.println("No Play : " + position);
                    break;
            }
        }
        System.out.println("Winning Position Is : " + position);
    }
}

