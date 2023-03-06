public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,3,1};

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i, 0);
        }
        printArr(arr);
    }

    public static void heapify(int[] arr, int heapSize, int index) {
        int leftNode = index * 2 + 1;
        int rightNode = index * 2 + 2;
        int largest = index;

        if (leftNode < heapSize && arr[leftNode] > arr[largest]) {
            largest = leftNode;
        }

        if (rightNode < heapSize && arr[rightNode] > arr[largest]) {
            largest = rightNode;
        }


        if (index != largest) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            heapify(arr, heapSize, largest);
        }
    }

    public static void printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(',');
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(']');
        System.out.println(sb);
    }

}
