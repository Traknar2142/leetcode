public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 5, 6, 10, 9, 8, 1};

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        printArr(arr); //[10,8,9,5,6,2,7,3,1]

        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        printArr(arr);


    }

    public static int[] heapify(int[] arr, int heapSize, int index) {
        while (index <= heapSize / 2 - 1) {
            int leftNode = index * 2 + 1;
            int rightNode = index * 2 + 2;
            if ((arr[index] < arr[leftNode] || arr[index] < arr[rightNode]) && rightNode < heapSize) {
                if (arr[rightNode] < arr[leftNode]) {
                    int temp = arr[leftNode];
                    arr[leftNode] = arr[index];
                    arr[index] = temp;
                    index = leftNode;
                } else {
                    int temp = arr[rightNode];
                    arr[rightNode] = arr[index];
                    arr[index] = temp;
                    index = rightNode;
                }
            } else break;
        }

        return arr;
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
