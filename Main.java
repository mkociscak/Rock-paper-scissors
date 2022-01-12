import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in); //Scanner=imported utility • System.in=userInput

        while (true) {
            String[] rpsAM = {"r", "p", "s"};    //available moves r = rock etc.
            String computerPlay = rpsAM[new Random().nextInt(rpsAM.length)]; //Random=imported utility • .nextInt=method

            String userInput;

            while (true) {
                System.out.println("Enter your move (r, p, or s)");
                userInput = scannerA.nextLine();
                if (userInput.equals("r") || userInput.equals("p") || userInput.equals("s")) {
                    //System.out.println("Computer played " + computerPlay);
                    break;
                }
                System.out.println(userInput + " is not a valid move.");
            }

            System.out.println("Computer played " + computerPlay);

            if (userInput.equals(computerPlay)) {
                System.out.println("The game is a tie.");
            } else if (userInput.equals("r")) {
                if (computerPlay.equals("p")) {
                    System.out.println("You lose to the computer this time.");
                }
                if (computerPlay.equals("s")) {
                    System.out.println("You won!");
                }
            } else if (userInput.equals("p")) {
                if (computerPlay.equals("s")) {
                    System.out.println("You lose to the computer this time.");
                }
                if (computerPlay.equals("r")) {
                    System.out.println("You won!");
                }
            } else if (userInput.equals("s")) {
                if (computerPlay.equals("r")) {
                    System.out.println("You lose to the computer this time.");
                }
                if (computerPlay.equals("p")) {
                    System.out.println("You won!");
                }
            }
            System.out.println("Play again? (Enter y or n)");
            String playOn = scannerA.nextLine();                //as scanner @ start

            if (!playOn.equals("y")) {
                System.out.println("See you next time.");
                break;
            }

        }
        scannerA.close();
    }
}
