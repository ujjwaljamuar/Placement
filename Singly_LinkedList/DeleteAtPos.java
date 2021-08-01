package Singly_LinkedList;

public class DeleteAtPos {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;

        }
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");

    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int value){
        ListNode newNode  = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int value, int position){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }

        else{
            ListNode previous = head;
            int count = 1;

            while(count < position - 1){
                previous = previous.next;
                count++;

            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;

        }
    }

    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void deleteAtPos(int position){
        if(position == 1){
            head = head.next;
            }
        else{
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        DeleteAtPos sll = new DeleteAtPos();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.insertFirst(5);
        sll.insertFirst(4);
        sll.insertFirst(3);
        sll.insertFirst(2);
        
        sll.insertEnd(50);
        sll.insertEnd(60);
        sll.insertEnd(70);
        sll.insertEnd(80);
        
        sll.insert(1, 1);
        sll.insert(90, 14);
        sll.insert(15, 7);
        
        sll.deleteFirst();
        sll.deleteLast();
        sll.deleteAtPos(2);

        sll.display();
        System.out.println();
        

        System.out.println("Length of the Linked List is " + sll.length());
    }
}

