public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] minHeap = new int[k + 1];
        int heapSize = k;

        for (int i = 0; i < nums.length; i++) {
            if (i < heapSize) {
                add(minHeap, nums[i], i + 1);
            } else if (nums[i] > minHeap[1]){
                minHeap[1] = nums[i];
                heapify(minHeap,1);
            }
        }
        return minHeap[1];
    }

    private void add(int[] minHeap, int el, int realSize) {
        minHeap[realSize] = el;
        int current = realSize;

        while (current > 1) {
            int parent = current / 2;
            if (minHeap[current] < minHeap[parent]) {
                int temp = minHeap[current];
                minHeap[current] = minHeap[parent];
                minHeap[parent] = temp;

                current = parent;

            } else break;
        }

    }

    private void heapify(int[] minHeap, int index) {
        int current = index;
        int leftNode = current * 2;
        int rightNode = current * 2 + 1;

        if (leftNode < minHeap.length && minHeap[current] > minHeap[leftNode]) {
            current = leftNode;

        } if (rightNode < minHeap.length && minHeap[current] > minHeap[rightNode]) {
            current = rightNode;
        } if (index != current){
            int temp = minHeap[current];
            minHeap[current] = minHeap[index];
            minHeap[index] = temp;

            heapify(minHeap, current);
        }

    }

}
