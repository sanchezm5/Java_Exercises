package programs_Day1;

/** Write a Java program by using three for loops to print the following pattern:
 *
 *          1******
 *          12*****
 *          123****
 *          1234***
 *          12345**
 *          123456*
 *          1234567
 */

public class LoopStatements {

    public static void printLoopsPattern() {

        int rows = 7;

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for(int k = 1; k < rows - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printLoopsPattern();
    }
}