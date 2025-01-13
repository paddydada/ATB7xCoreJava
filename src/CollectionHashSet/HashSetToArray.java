package CollectionHashSet;

import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");

        // Convert to array
        String[] array = set.toArray(new String[0]);

        System.out.println("HashSet as array:");
        for (String lang : array) {
            System.out.println(lang);
        }
    }
}

