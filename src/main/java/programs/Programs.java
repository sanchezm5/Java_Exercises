package programs;

/** Write a java program to display the following series:
 *
 *                  *
 *                 * *
 *                * * *
 *               * * * *
 *              * * * * *
 */

public class Programs {

    public static void printPattern() {

        int rows = 5;

        for(int i = 0; i < rows; i++) {

            // prints a space between *
            for(int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern();
    }
}
