package Singly_LinkedList;

public class nthNodeFromEnd {
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

    public ListNode getNthNodeFromEnd(int n) {
		if(head == null) {
			return null;
		}

		if(n <= 0) {
			throw new IllegalArgumentException("Invalid value: n = " + n);
		}

		ListNode mainPtr = head;
		ListNode refPtr = head;

		int count = 0;

		while(count < n) {
			if(refPtr == null) {
				throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
			}
			refPtr = refPtr.next;
			count++;
		}

		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
    public static void main(String[] args) {
        nthNodeFromEnd sll = new nthNodeFromEnd();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        System.out.println();

        ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(1);
        System.out.println("Nth Node is -> " + nthNodeFromEnd.data);
    }
}
