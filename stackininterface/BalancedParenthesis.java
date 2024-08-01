package stackininterface;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false; // Unbalanced
                }
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false; // Unbalanced
                }
            }
        }

        return stack.isEmpty(); // If stack is empty, it's balanced
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        boolean result = isBalanced(input);
        System.out.println("Is the string balanced? " + result);
    }
}

