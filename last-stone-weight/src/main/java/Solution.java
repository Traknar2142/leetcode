import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1){
            return stones[0];
        }

        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (Integer el : stones){
            maxHeap.offer(el);
        }

        while (maxHeap.size() != 1 && maxHeap.size() != 0){
            int stoneOne = maxHeap.poll();
            int stoneTwo  = maxHeap.poll();
            if (stoneOne != stoneTwo){
                int abs = Math.abs(stoneOne - stoneTwo);
                maxHeap.offer(abs);
            }
        }
        if (maxHeap.size() == 1){
            return maxHeap.peek();
        } else return 0;
    }
}