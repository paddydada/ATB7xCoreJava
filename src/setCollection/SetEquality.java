package setCollection;

import java.util.*;

public class SetEquality {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 3, 2, 1));

        // Compare sets for equality
        boolean areEqual = set1.equals(set2);

        System.out.println("Are the two sets equal? " + areEqual);
    }
}
