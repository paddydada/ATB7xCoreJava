package CollectionHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
 
            char[] tempArray = str.toCharArray();
            Arrays.sort(tempArray);
            String sortedStr = new String(tempArray);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }

        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}


//[eat, tea, ate]
//[bat]
//[tan, nat]