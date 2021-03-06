/**
 *  (Check Password) Some websites impose certain rules for passwords.
 *  Write a method that checks whether a string is a valid password.
 *  Suppose the password rules are as follows:
 *
 *          - A password must have at least eight characters.
 *          - A password consists of only letters and digits.
 *          - A password must contain at least two digits.
 *
 *  Write a program that prompts the user to enter a password and displays
 *  Valid Password if the rules are followed or Invalid Password otherwise.
 */

package strings;

import java.util.Scanner;

public class CheckPassword {

    public static String checkForValidPassword() {

        Scanner scan = new Scanner(System.in);
        System.out.println("*************************   PASSWORD RULES   *************************");
        System.out.println("A password must have at least eight characters, \nconsist of only letters and digits, and contain at least two digits.");
        System.out.println("********************************************************************** ");
        System.out.print("Enter password: ");
        String userInput = scan.nextLine().toLowerCase().trim();
        scan.close();

        String passwordType = "Valid Password";
        int digitCounter = 0;
        int letterCounter = 0;

        if (userInput.length() < 8) {
            return "\nInvalid Password";
        } else {
            for (int i = 0; i < userInput.length(); i++) {
                if (userInput.charAt(i) >= 'a' && userInput.charAt(i) <= 'z') {
                    letterCounter++;
                } else if (userInput.charAt(i) >= '0' && userInput.charAt(i) <= '9') {
                    digitCounter++;
                } else {
                    return "\nInvalid Password";
                }
            }
        }
        if (digitCounter < 2 || letterCounter == 0) {
            passwordType = "Invalid Password";
        }
        return "\n" + passwordType;
    }

    public static void main(String[] args) {
        System.out.println(checkForValidPassword());
    }
}
