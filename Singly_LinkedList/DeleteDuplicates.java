package Singly_LinkedList;

public class DeleteDuplicates {
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

    public void removeDuplicates(){
        if(head == null){
            return;
        }
        ListNode current = head;

        while (current != null && current.next != null) {
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        DeleteDuplicates sll = new DeleteDuplicates();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        sll.removeDuplicates();
        System.out.println();

        sll.display();
    }
}
