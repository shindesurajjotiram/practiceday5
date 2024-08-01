package mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static char findFirstNonRepeatedChar(String input) {
        Map<Character, Integer> charCounts = new LinkedHashMap<>();


        for (char c : input.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

                for (char c : input.toCharArray()) {
            if (charCounts.get(c) == 1) {
                return c;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String inputString = "abacddbec";
        char result = findFirstNonRepeatedChar(inputString);
        System.out.println("First non-repeated character: " + result);
    }
}
