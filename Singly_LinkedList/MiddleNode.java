package Singly_LinkedList;

public class MiddleNode {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode (int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public ListNode getMiddleNode() {
		if(head == null) {
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
    public static void main(String[] args) {
        MiddleNode sll = new MiddleNode();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);


        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        sll.display();

        System.out.println();
        ListNode middleNode = sll.getMiddleNode();
        System.out.println("Middle Node is "+middleNode.data);
    }   
}
