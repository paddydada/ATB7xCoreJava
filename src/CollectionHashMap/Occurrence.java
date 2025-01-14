package CollectionHashMap;

import java.util.HashMap;
import java.util.Map;

public class Occurrence {

    public static void main(String[] args) {

        String name = "12398712491programming";

        // Map to store character frequencies (for both digits and alphabets)
        Map<Character, Integer> map = new HashMap<>();

        // Iterate over each character
        for (char c : name.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                // Update frequency
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        // Print the frequencies
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
