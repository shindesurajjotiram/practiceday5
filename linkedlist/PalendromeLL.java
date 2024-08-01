package linkedlist;


public class PalendromeLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        // Method to insert at the tail
        public void insertAtTail(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.print("null");
            System.out.println();
        }

        public int getSize() {
            Node current = head;
            int count = 0;

            while (current != null) {
                count++;
                current = current.next;
            }

            return count;
        }

        // Method to check if the linked list is a palindrome
        public boolean palindromeCheck() {
            if (head == null || head.next == null) {
                return true;
            }

            // Find the middle of the linked list
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse the second half of the linked list
            Node prev = null;
            Node current = slow;
            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            // Compare the first half and the reversed second half
            Node firstHalf = head;
            Node secondHalf = prev;
            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtTail(1);
        ll.insertAtTail(2);
        ll.insertAtTail(3);
        ll.insertAtTail(2);
        ll.insertAtTail(1);
        //ll.insertAtTail(1);

        int size = ll.getSize();

        ll.printList();

        if (ll.palindromeCheck()) {
            System.out.println("LL IS PALINDROME!");
        } else {
            System.out.println("LL IS NOT PALINDROME!");
        }
    }
}