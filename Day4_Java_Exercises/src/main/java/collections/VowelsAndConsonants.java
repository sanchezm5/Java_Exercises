/**
 *  Write a program that prompts the user to enter a text and displays the number of vowels and consonants in the file.
 *  Use a set to store the vowels A, E, I, O, and U.
 */

package collections;

import java.util.HashSet;
import java.util.Scanner;

public class VowelsAndConsonants {

    public static String countVowelsAndConsonants() {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int vowels = 0;
        int consonants = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text here: ");
        String userInput = scan.nextLine().toLowerCase();
        scan.close();

        for (int i = 0; i < userInput.length(); i++) {
            if (set.contains(userInput.charAt(i))) {
                vowels++;
            } else if (userInput.charAt(i) >= 'a' && userInput.charAt(i) <= 'z') {
                consonants++;
            } else {
                continue;
            }
        }
        return "Number of vowels: " + vowels + ",   Number of Consonants: " + consonants;
    }

    public static void main(String[] args) {
        System.out.println(countVowelsAndConsonants());
    }
}
