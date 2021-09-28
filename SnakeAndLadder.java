import java.util.Random;

public class SnakeAndLadder {
    //initializing start position
    int position = 0;

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

    /* This method is used to check for no play, snake or ladder
     * create instance of random class
     * initializing dice
     * using random function to create three random options 0, 1 and 2
     * print option 0, 1 or 2
     * assign them to no play, ladder and snake
     * if No Play, Player remains at his last position
     * if Ladder, Player moves forward with dice roll number
     * if Snake, Player moves backward with dice roll number
     */
        public void playerOption () {
            Random random = new Random();
            int dice = rollDice();
            int option = random.nextInt(3);
            System.out.println("Player Option Is : " + option);
            System.out.println("0.No Play 1.Ladder 2.Snake");
            switch (option) {

                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    position += dice;
                    break;
                case 2:
                    System.out.println("Snake");
                    position -= dice;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
