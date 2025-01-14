package CollectionHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);

        System.out.println("Original List: " + list);

        // Use HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>(list);

        System.out.println("After removing duplicates: " + set);
    }
}
