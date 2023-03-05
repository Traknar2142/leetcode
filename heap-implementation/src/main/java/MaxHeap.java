public class MaxHeap {
    private int[] maxHeap;
    private int heapSize;
    private int realSize;

    public MaxHeap(int size) {
        this.heapSize = size;
        maxHeap = new int[heapSize + 1];
        maxHeap[0] = 0;
    }

    public void add(int el) {
        realSize++;
        if (realSize > heapSize) {
            System.out.println("too much elements");
            realSize--;
            return;
        }

        maxHeap[realSize] = el;
        int index = realSize;
        int parent = realSize / 2;

        while (maxHeap[index] > maxHeap[parent] && index > 1) {
            int temp = maxHeap[parent];
            maxHeap[parent] = maxHeap[index];
            maxHeap[index] = temp;
            index = parent;
            parent = index / 2;
        }
    }

    public int pop() {
        if (realSize < 1) {
            System.out.println("there is no value");
            return Integer.MIN_VALUE;
        }
        int deletedElement = maxHeap[1];
        maxHeap[1] = maxHeap[realSize];
        realSize--;

        int index = 1;

        while (index <= realSize / 2) {
            int leftNode = index * 2;
            int rightNode = index * 2 + 1;

            if (maxHeap[index] < maxHeap[leftNode] || maxHeap[index] < maxHeap[rightNode]) {
                if (maxHeap[leftNode] > maxHeap[rightNode]) {
                    int temp = maxHeap[leftNode];
                    maxHeap[leftNode] = maxHeap[index];
                    maxHeap[index] = temp;
                    index = leftNode;
                } else {
                    int temp = maxHeap[rightNode];
                    maxHeap[rightNode] = maxHeap[index];
                    maxHeap[index] = temp;
                    index = leftNode;
                }
            } else break;
        }
        return deletedElement;
    }

    @Override
    public String toString() {
        if (realSize == 0) {
            return "No elements";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 1; i <= realSize; i++) {
            sb.append(maxHeap[i]).append(',');
        }
        sb.deleteCharAt(sb.length() - 1).append(']');

        return sb.toString();
    }
}
