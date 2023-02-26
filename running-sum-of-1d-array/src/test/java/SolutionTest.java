import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test1(){
        int[] expected1 = {1,3,6,10};
        int[] expected2 = {1,2,3,4,5};
        int[] expected3 = {3,4,6,16,17};
        Assertions.assertArrayEquals(expected1, new Solution().runningSum(new int[]{1,2,3,4}));
        Assertions.assertArrayEquals(expected2, new Solution().runningSum(new int[]{1,1,1,1,1}));
        Assertions.assertArrayEquals(expected3, new Solution().runningSum(new int[]{3,1,2,10,1}));

    }
}
