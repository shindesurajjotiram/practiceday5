package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class DublicateElementsInArrayList {

    public static void findDuplicates(int[] nums) {
        Map<Integer, Integer> numCounts = new HashMap<>();

        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println("Duplicate: " + num + ", Count: " + count);
            }
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 4, 3, 5, 6, 5, 7};
        findDuplicates(inputArray);
    }
}

