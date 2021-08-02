package Singly_LinkedList;

public class InsertInSorted {
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

    public ListNode InsertInSortedList(int value){
        ListNode newNode = new ListNode(value);
        if (head == null) {
            return newNode;
        }

        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data ){
            temp = current;
            current = current.next;

        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        InsertInSorted sll = new InsertInSorted();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.InsertInSortedList(35);

        sll.display();
    }
}
