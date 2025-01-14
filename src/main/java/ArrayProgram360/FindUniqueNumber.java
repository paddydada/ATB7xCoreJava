package ArrayProgram360;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindUniqueNumber {

    public static void main(String[] args) {
        int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };

        // Calculate length of the array
        int len = arrayWithDuplicates.length;

        // Use a HashSet to store unique numbers
        HashSet<Integer> hashset = new HashSet<>();

        // Add unique numbers to the HashSet
        for (int i = 0; i < len; i++) {
            hashset.add(arrayWithDuplicates[i]);
        }

        // Convert HashSet to ArrayList for sorting
        ArrayList<Integer> uniqueNumbers = new ArrayList<>(hashset);

        // Sort the ArrayList in ascending order
        Collections.sort(uniqueNumbers);

        // Print the sorted unique numbers
        System.out.println("Sorted unique numbers: " + uniqueNumbers);
    }
}
