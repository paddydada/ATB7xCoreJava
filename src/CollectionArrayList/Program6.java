package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Program6 {

    public static void main(String[] args) {
        // Write a Java program to find common, non-common, intersection, etc.
        
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Banana", "Grapes", "Apple"));

        // Convert both ArrayLists to HashSet
        HashSet<String> set1 = new HashSet<>(list1);
        HashSet<String> set2 = new HashSet<>(list2);

        // Common elements (Intersection)
        HashSet<String> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        
        // Non-common elements (Exclusive)
        HashSet<String> nonCommonElements = new HashSet<>(set1);
        nonCommonElements.removeAll(set2);
        
        // Elements that are only in list2 and not in list1
        HashSet<String> nonCommonInList2 = new HashSet<>(set2);
        nonCommonInList2.removeAll(set1);

        // Union (All elements from both sets)
        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);

        // Print the results
        System.out.println("Common Elements (Intersection): " + commonElements);
        System.out.println("Non-Common Elements (Exclusive to list1): " + nonCommonElements);
        System.out.println("Non-Common Elements (Exclusive to list2): " + nonCommonInList2);
        System.out.println("Union of both lists: " + union);
    }
}
