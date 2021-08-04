package Queue;

import java.util.NoSuchElementException;

public class Dequeue {
    private ListNode front;
    private ListNode rear;
    private int length;

    public Dequeue() {
        front = null;
        rear = null;
        length = 0;
    }

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void print() {
        if (isEmpty()) {
            return;
        }

        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public int dequeuee() {
        if (isEmpty()) {
            throw new NoSuchElementException("Already Empty.");
        }

        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }

        length--;
        return result;
    }

    public static void main(String[] args) {
        Dequeue queue = new Dequeue();
        System.out.print("Queue => ");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.print();

        System.out.println();

        queue.dequeuee();
        queue.dequeuee();
        System.out.print("After dequeue => ");
        queue.print();
    }
}
