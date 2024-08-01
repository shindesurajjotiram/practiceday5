package stackininterface;

import java.util.Stack;

public class NextGreaterElement {

    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int poppedIndex = stack.pop();
                result[poppedIndex] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int poppedIndex = stack.pop();
            result[poppedIndex] = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] originalArray = {4, 5, 2, 10, 8};
        int[] nextGreaterElements = findNextGreaterElements(originalArray);

        System.out.print("Next Greater Elements: ");
        for (int element : nextGreaterElements) {
            System.out.print(element + " ");
        }
    }
}
