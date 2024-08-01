package stackininterface;

import java.util.Stack;

public class StackSorting {

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int topElement = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, topElement);
        }
    }

    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element >= stack.peek()) {
            stack.push(element);
        } else {
            int topElement = stack.pop();
            insertInSortedOrder(stack, element);
            stack.push(topElement);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(5);
        myStack.push(2);
        myStack.push(8);
        myStack.push(1);
        myStack.push(3);

        System.out.println("Original stack: " + myStack);
        sortStack(myStack);
        System.out.println("Sorted stack: " + myStack);
    }
}

