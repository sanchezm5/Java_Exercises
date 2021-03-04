/** (Count positive and negative numbers and compute the average of numbers)
 *  Write a program that reads an unspecified number of integers, determines how many positive and negative values
 *  have been read, and computes the total and average of the input values (not counting zeros).
 *  Your program ends with the input 0. Display the average as a floating-point number.
 *
 *  Here is a sample run:
 *              Enter an integer, the input ends if it is 0: 1  2 -1  3  0
 *              The number of positives is 3
 *              The number of negatives is 1
 *              The total is 5
 *              The average is 1.25
 *        or
 *              Enter an integer, the input ends if it is 0: 0
 *              No numbers are entered except 0
 */

package programs;

import java.util.Scanner;

public class FlowControlPatterns2 {

    public static void countsAndAverages() {
        int input;
        int total = 0;
        int numOfPositives = 0;
        int numOfNegatives = 0;
        float average;

        // Prompt for user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");

        do {
            input = Integer.parseInt(scan.nextLine());

            // If user enters 0, exit the application
            if (input == 0 && total == 0) {
                System.out.println("No numbers are entered except 0");
                scan.close();
                System.exit(0);
            } else {
                total += input;
                if (input > 0) {
                    numOfPositives++;
                } else if (input < 0) {
                    numOfNegatives++;
                }
            }
        } while (input != 0);
        scan.close();

        // Print results
        System.out.println("***********************************");
        System.out.println("The number of positives is " + numOfPositives);
        System.out.println("The number of negatives is " + numOfNegatives);
        System.out.println("The total is " + total);
        average = (float)total / (numOfNegatives + numOfPositives);
        System.out.println("The average is " + average);
    }

    public static void main(String[] args) {
        countsAndAverages();
    }
}
