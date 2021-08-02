package Singly_LinkedList;

public class deleteKey {
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

    public void deleteNode(int key) {
		ListNode current = head;
		ListNode temp = null;

		if(current != null && current.data == key){
			head = current.next;
			return;
		}

		while(current != null && current.data != key){
			temp = current;
			current = current.next;
		}

		if(current == null){
			return;
		}

		temp.next = current.next;
	}
    public static void main(String[] args) {
        deleteKey sll = new deleteKey();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.deleteNode(30);
        sll.display();
    }
}
