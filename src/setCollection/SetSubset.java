package setCollection;

import java.util.*;

public class SetSubset{

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        // Check if set1 is a subset of set2
        boolean isSubset = set2.containsAll(set1);

        System.out.println("Is set1 a subset of set2? " + isSubset);
    }
}
