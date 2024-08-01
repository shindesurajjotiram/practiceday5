package queueinterface;
public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    public boolean enqueue(int x) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = x;
        size++;
        return true;
    }
    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int result = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return result;
    }
    public int front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }
    public int rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[rear];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        System.out.println(circularQueue.enqueue(1));
        System.out.println(circularQueue.enqueue(2));
        System.out.println(circularQueue.enqueue(3));
        System.out.println(circularQueue.enqueue(4));
        System.out.println(circularQueue.enqueue(5));
        System.out.println(circularQueue.enqueue(6));
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.front());
        System.out.println(circularQueue.rear());
    }
}