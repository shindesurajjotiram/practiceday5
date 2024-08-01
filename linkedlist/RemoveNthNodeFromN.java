package linkedlist;

public class RemoveNthNodeFromN {
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
        public int getSize() {
            Node current = head;
            int count = 0;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
        public void kth_fromlast(int size, int k) {
            if (head == null || head.next == null) {
                return;
            }
            int moves_from_front = size - k;
            Node temp = head;
            while (temp != null && moves_from_front > 1) {
                moves_from_front--;
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtTail(1);
        ll.insertAtTail(2);
        ll.insertAtTail(3);
        ll.insertAtTail(4);
        ll.insertAtTail(5);
        ll.insertAtTail(6);
        ll.insertAtTail(7);
        ll.insertAtTail(8);

        int k = 4;
        int size = ll.getSize();
        ll.printList();
        ll.kth_fromlast(size, k);
        ll.printList();
    }
}