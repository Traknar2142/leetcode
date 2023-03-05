public class Main {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(9);
        maxHeap.add(5);
        maxHeap.add(3);
        maxHeap.add(7);
        maxHeap.add(2);
        maxHeap.add(4);
        maxHeap.add(23);
        maxHeap.add(44);
        maxHeap.add(1);
        maxHeap.add(24);
        System.out.println(maxHeap);
        maxHeap.pop();
        System.out.println(maxHeap);


    }
}
