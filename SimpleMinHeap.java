import java.util.PriorityQueue;
public class SimpleMinHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(15);
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(5);
		
		 System.out.println("Heap contents:");
        for (int val:minHeap){
            System.out.println(val);
        }
        System.out.println("Removing elements:");
        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll());
        }
    }
}
