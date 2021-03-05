/** (Display four patterns using loops)
 *  Use nested loops that display the following patterns in four separate programs:
 *
 *          Pattern A           Pattern B           Pattern C           Pattern D
 *          1       	        1 2 3 4 5 6                 1 	        1 2 3 4 5 6
 *          1 2     	        1 2 3 4 5                 2 1   	      1 2 3 4 5
 *          1 2 3   	        1 2 3 4                 3 2 1               1 2 3 4
 *          1 2 3 4 	        1 2 3                 4 3 2 1                 1 2 3
 *          1 2 3 4 5 	        1 2 	            5 4 3 2 1 	    	        1 2
 *          1 2 3 4 5 6 	    1 	              6 5 4 3 2 1 	                  1
 */

package programs_Day1;

public class FlowControlPatterns3 {

    public static void createPatternA() {
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void createPatternB() {
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void createPatternC() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = i + 1; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void createPatternD() {
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("***************** Pattern A");
        createPatternA();
        System.out.println("***************** Pattern B");
        createPatternB();
        System.out.println("***************** Pattern C");
        createPatternC();
        System.out.println("***************** Pattern D");
        createPatternD();
    }
}
