class Solution {
    public int heightChecker(int[] heights) {
        int[] oldArray = heights.clone();
        return getCountOfDiscrepancy(oldArray, bubbleSort(heights));

    }
    private int[] bubbleSort(int[] arr){
        boolean hasSwap = true;

        while(hasSwap){
            hasSwap = false;
            for (int i = 0; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    hasSwap = true;
                }
            }
        }
        return arr;
    }

    private int getCountOfDiscrepancy(int[] arr, int[] sortedArr){
        int countOfDiscrepancy = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != sortedArr[i]){
                countOfDiscrepancy++;
            }
        }
        return countOfDiscrepancy;
    }
}