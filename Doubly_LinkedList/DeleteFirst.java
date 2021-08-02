package Doubly_LinkedList;

import java.util.NoSuchElementException;

public class DeleteFirst {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DeleteFirst() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0; // or head == null;
    }

    public int length() {
        return length;
    }

    public void displayForward() {
		if(head == null) {
			return;
		}
		
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward() {
		if(head == null) {
			return;
		}
		
		ListNode temp = tail;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.previous;
		}
		System.out.println("null");
	}

    public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}

    public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}

    public ListNode deleteFirstNode() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}

		ListNode temp = head;
		if(head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}

    public static void main(String[] args) {
        DeleteFirst dll = new DeleteFirst();
        

        dll.insertLast(40);
        dll.insertLast(50);
        dll.insertLast(60);



        dll.displayForward();

        System.out.println();
        dll.displayBackward();

        dll.deleteFirstNode();

        System.out.println();

        dll.displayForward();

        System.out.println();
        dll.displayBackward();
    }
}
