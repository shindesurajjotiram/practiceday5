package stackininterface;

import java.util.Stack;

public class StackReversal {

    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int topElement = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, topElement);
        }
    }

    private static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
        } else {
            int topElement = stack.pop();
            insertAtBottom(stack, element);
            stack.push(topElement);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println("Original stack: " + myStack);
        reverseStack(myStack);
        System.out.println("Reversed stack: " + myStack);
    }
}
