package mapinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGrouping {
    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : strings) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            anagramGroups.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] inputStrings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(inputStrings);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
