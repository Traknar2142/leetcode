import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {
    private Queue<Integer> queue;
    private static int heapSize;

    public KthLargest(int k, int[] nums) {
        this.queue = new PriorityQueue<>();
        heapSize = k;
        for (int el: nums){
            queue.offer(el);
        }
        while (queue.size() > k){
            queue.poll();
        }
    }

    public int add(int val) {
        queue.offer(val);
        while (queue.size() > heapSize){
            queue.poll();
        }
        return queue.peek();
    }
}