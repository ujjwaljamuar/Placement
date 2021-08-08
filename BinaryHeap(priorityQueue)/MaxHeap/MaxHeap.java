public class MaxHeap {

    private Integer[] heap;
    private int n;

    public  MaxHeap(int capacity){
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size() {
        return n;
    }

    public static void main(String[] args) {
        MaxHeap pq = new MaxHeap(3);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
    }
}
