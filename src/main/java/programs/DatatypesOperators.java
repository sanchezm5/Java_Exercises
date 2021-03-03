package programs;

/** Using only the programming techniques you learned in this lesson, write an application that calculates the squares
 *  and cubes of between two numbers and prints the resulting values in table format, as shown below.
 *  Table Format: number  square  cube  [don't use any java built in method]
 *
 *  Example: Input: 0  10
 *           Output: 0            0             0
 *                   1            1             1
 *                   2            4             8
 *                   .
 *                   .
 *                   .
 *                  10          100           1000
 */

public class DatatypesOperators {

    public static void getSquaresAndCubes(int num1, int num2) {

        int[][] result = new int[num2 + 1][3];

        for (int i = num1; i < num2 + 1; i++) {
            result[i][0] = num1++;
            result[i][1] = i * i;
            result[i][2] = result[i][1] * i;
            System.out.println(result[i][0] + "     " + result[i][1] + "     " + result[i][2]);
        }
    }

    public static void main(String[] args) {
        getSquaresAndCubes(0,10);
    }
}
