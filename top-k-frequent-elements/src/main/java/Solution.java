import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] minHeap = new int[k];
        int counter = 0;

        for (Integer el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (counter < k) {
                add(minHeap, entry.getKey(), counter, map);
                counter++;
            } else if (map.get(minHeap[0]) < entry.getValue()) {
                minHeap[0] = entry.getKey();
                heapify(minHeap, map, 0);
            }

        }

        return minHeap;
    }

    private void add(int[] minHeap, int el, int realSize, Map<Integer, Integer> map) {
        minHeap[realSize] = el;
        int current = realSize;

        while (current > 0) {
            int parent = (current -1) / 2;
            if (map.get(minHeap[current]) < map.get(minHeap[parent])) {
                int temp = minHeap[current];
                minHeap[current] = minHeap[parent];
                minHeap[parent] = temp;

                current = parent;

            } else break;
        }

    }

    private void heapify(int[] minHeap, Map<Integer, Integer> map, int index) {
        int current = index;
        int leftNode = current * 2 + 1;
        int rightNode = current * 2 + 2;

        if (leftNode < minHeap.length && map.get(minHeap[current]) > map.get(minHeap[leftNode])) {
            current = leftNode;

        }
        if (rightNode < minHeap.length && map.get(minHeap[current]) > map.get(minHeap[rightNode])) {
            current = rightNode;
        }
        if (index != current) {
            int temp = minHeap[current];
            minHeap[current] = minHeap[index];
            minHeap[index] = temp;

            heapify(minHeap, map, current);
        }
    }
}