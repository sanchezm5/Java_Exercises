/** (Game: Lottery) to generate a lottery of a three-digit number.
 *  The program prompts the user to enter a three-digit number and determines whether the user wins according to the
 *  following rules:
 *              1. If the user input matches the lottery number in the exact order, the award is $10,000.
 *              2. If all the digits in the user input match all the digits in the lottery number, the award is $3,000.
 *              3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 */

package programs_Day1;

import java.util.Random;
import java.util.Scanner;

public class FlowControlPatterns1 {

    public static void lotteryGame() {

        // Prompt for user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a three-digit number between 100 and 999: ");
        String userInput = scan.nextLine();
        scan.close();

        // Generate a random lottery number
        Random random = new Random();
        int lotteryNumber = 100 + random.nextInt(1000 - 100);
        System.out.println("The lottery number is: " + lotteryNumber);

        // Compare user input to random lottery number
        String lotto = Integer.toString(lotteryNumber);
        int counter = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (userInput.charAt(j) == lotto.charAt(i)) {
                    counter++;
                    break;
                }
            }
        }

        // Check to see if the user won
        System.out.println("********************************");
        switch(counter) {
            case 3:
                if (userInput.equals(lotto)) {
                    System.out.println("You win $10,000.");
                } else {
                    System.out.println("You win $3,000.");
                }
                break;
            case 2:
            case 1:
                System.out.println("You win $1,000.");
                break;
            default:
                System.out.println("You lose! Try again later!");
        }
    }

    public static void main(String[] args) {
        lotteryGame();
    }
}
