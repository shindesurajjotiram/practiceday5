package linkedlist;

public class MergeTwoLinkedlists {

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


        public LinkedList merge(LinkedList ll1, LinkedList ll2) {
            Node temp = new Node(99999999);
            Node back = temp;

            Node head1 = ll1.head;
            Node head2 = ll2.head;

            while (head1 != null && head2 != null) {
                if (head1.data <= head2.data) {
                    back.next = head1;
                    head1 = head1.next;
                } else {
                    back.next = head2;
                    head2 = head2.next;
                }
                back = back.next;
            }

            if (head1 != null) {
                back.next = head1;
            } else {
                back.next = head2;
            }

            LinkedList mergedList = new LinkedList();
            mergedList.head = temp.next;

            return mergedList;
        }
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();

        ll1.insertAtTail(1);
        ll1.insertAtTail(2);
        ll1.insertAtTail(7);
        ll1.insertAtTail(8);
        ll1.insertAtTail(9);

        LinkedList ll2 = new LinkedList();

        ll2.insertAtTail(3);
        ll2.insertAtTail(4);
        ll2.insertAtTail(5);
        ll2.insertAtTail(6);
        ll2.insertAtTail(10);

        LinkedList mergedList = ll1.merge(ll1, ll2);

        mergedList.printList();
    }
}