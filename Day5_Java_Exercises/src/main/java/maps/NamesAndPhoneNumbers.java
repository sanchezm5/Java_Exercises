/**
 *  Write a java program that loads names and phone numbers. It takes a name or phone number as input and prints the
 *  corresponding other value in console. You can store the data in hashmap itself or database to read the data.
 *  [add few phone numbers and names in hashmap before you run the application]
 *
 *  Example: If you enter a name as input, it has to display the phone number of the customer OR
 *           if you enter a phone number as input, it has to display the name of the customer in the console.
 */

package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NamesAndPhoneNumbers {

    public static void getNameOrPhoneNumber() {
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("973-001-0001","George Washington");
        hashMap.put("973-003-0002", "Thomas Jefferson");
        hashMap.put("973-016-0005", "Abraham Lincoln");
        hashMap.put("973-000-0010", "Alexander Hamilton");
        hashMap.put("973-007-0020", "Andrew Jackson");
        hashMap.put("973-018-0050", "Ulysses S. Grant");
        hashMap.put("973-000-0100", "Benjamin Franklin");

        System.out.println("******* Lookup Customer Information *******\nEnter a name (e.g. Jane Doe) or enter a phone number (e.g 000-111-2222):");
        Scanner scan = new Scanner(System.in);
        String option = scan.nextLine();
        scan.close();

        String result = "";
        for (Map.Entry<String,String> entry: hashMap.entrySet()) {
            if(option.equalsIgnoreCase(entry.getKey())){
                result = "Name: " + entry.getValue();
            } else if (option.equalsIgnoreCase(entry.getValue())) {
                result = "Phone Number: " + entry.getKey();
            }
        }
        if (result.equals("")) {
            result = "Invalid entry.";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        getNameOrPhoneNumber();
    }
}
