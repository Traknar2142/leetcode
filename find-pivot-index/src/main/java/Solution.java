import java.util.Arrays;

public class Solution {
    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int countSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countSum == sum - nums[i]) {
                return i;
            }
            countSum += nums[i];
            sum -= nums[i];
        }
        return -1;
    }
}
