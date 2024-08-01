package queueinterface;

import java.util.LinkedList;
import java.util.Queue;

class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String s) {
        int[] charCount = new int[26];

        Queue<Character> queue = new LinkedList<>();

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
            if (charCount[c - 'a'] == 1) {
                queue.offer(c);
            } else {
                while (!queue.isEmpty() && charCount[queue.peek() - 'a'] > 1) {
                    queue.poll();
                }
            }
        }
        return queue.isEmpty() ? '-' : queue.peek();
    }

    public static void main(String[] args) {
        String inputString = "abacddbec";
        char result = findFirstNonRepeatingChar(inputString);
        System.out.println("First non-repeating character: " + result);
    }
}
