package linkedlist;

public class RemoveAllOccuranceOfLl {

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

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.print("null");
            System.out.println();
        }

        public void removeAlloccure(int target) {

            if (head != null && head.data == target) {
                head = head.next;
            }
            if (head == null) {
                return;
            }

            Node current = head;
            while (current != null && current.next != null) {
                if (current.next.data == target) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();

        ll1.insertAtTail(1);
        ll1.insertAtTail(2);
        ll1.insertAtTail(9);
        ll1.insertAtTail(7);
        ll1.insertAtTail(9);
        ll1.insertAtTail(8);
        ll1.insertAtTail(9);

        int target = 9;

        ll1.printList();
        ll1.removeAlloccure(target);
        ll1.printList();
    }
}