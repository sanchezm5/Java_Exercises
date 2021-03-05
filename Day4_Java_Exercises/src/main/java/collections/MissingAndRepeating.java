/**
 *  Given an unsorted list of size n, where the list elements are in the range from 1 to n.
 *  One number from the set {1, 2, … n} is missing and one number occurs twice in the list. Find these two numbers.
 *
 *  Examples:
 *          Input: arr= {3, 1, 3}
 *          Output: Missing = 2, Repeating = 3
 *
 *          Input: arr = {4, 3, 6, 2, 1, 1}
 *          Output: Missing = 5, Repeating = 1
 */


package collections;

import java.util.ArrayList;
import java.util.Collections;

public class MissingAndRepeating {

    public static String missingAndRepeating(ArrayList<Integer> list) {
        int n = list.size();
        int sumOfListSizeN = (n * (n + 1))/2;
        int repeating = 0;

        // Sort the list
        Collections.sort(list);
        int sum = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            sum += list.get(i);

            // check if current element is repeating
            if (list.get(i) == list.get(i-1)) {
                repeating = list.get(i);
            }
        }
        int missing = sumOfListSizeN - (sum - repeating);
        return "Missing = " + missing + ", Repeating = " + repeating;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(1);
        arr1.add(3);
        System.out.println(missingAndRepeating(arr1));

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(3);
        arr2.add(6);
        arr2.add(2);
        arr2.add(1);
        arr2.add(1);
        System.out.println(missingAndRepeating(arr2));
    }
}
