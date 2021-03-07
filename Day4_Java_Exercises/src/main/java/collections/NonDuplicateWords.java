/**
 *  Write a program that reads words from keyboard and displays all the non-duplicate words in ascending order.
 */

package collections;

import java.util.*;

public class NonDuplicateWords {

    public static String getNonDuplicateWords() {

        System.out.println("Enter text here: ");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        scan.close();

        String[] result = userInput.toLowerCase().split("\\s");
        List<String> words = Arrays.asList(result);

        Set<String> stringSet = new TreeSet<>();

        for (String word: words) {
            if(Collections.frequency(words, word) == 1) {
               stringSet.add(word);
            }
        }
        return "Non-duplicate words in ascending order: " + stringSet;
    }

    public static void main(String[] args) {
        System.out.println(getNonDuplicateWords());
    }
}
