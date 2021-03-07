/**
 *  Write a program that reads an unspecified number of integers and finds the one that has the most occurrences.
 *  The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3 3 3 2 0, the number 3 occurred
 *  most often. If not one but several numbers have the most occurrences, all of them should be reported.
 *  For example, since 9 and 3 appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported.
 */

package collections;

import java.util.*;

public class MostOccurrences {

    public static String findMostOccurrences() {

        // Store the user input into a hashmap along with the number of times it is entered
        Map<Integer,Integer> hashMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int userInput;
        System.out.println("Enter a list of integers. The input ends when you enter 0.");
        do {
            userInput = scan.nextInt();
            if (hashMap.containsKey(userInput)) {
                hashMap.put(userInput, hashMap.get(userInput) + 1);
            } else {
                hashMap.put(userInput, 1);
            }
        } while(userInput != 0);
        scan.close();

        // Iterate over the keys in the hashmap add store the most frequent numbers in an ArrayList
        List<Integer> list = new ArrayList<>();
        int maximum = 1;
        for (int key: hashMap.keySet()) {
            int count = hashMap.get(key);
            if (count == maximum) {
                list.add(key);
            } else if (count > maximum) {
                maximum = count;
                list.clear();
                list.add(key);
            }
        }
        return "Most occurring value(s): " + list;
    }

    public static void main(String[] args) {
        System.out.println(findMostOccurrences());
    }
}
