import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test(){
        Assertions.assertEquals(5, new Solution().findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        Assertions.assertEquals(4, new Solution().findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
        Assertions.assertEquals(1, new Solution().findKthLargest(new int[]{2,1}, 2));
        Assertions.assertEquals(3, new Solution().findKthLargest(new int[]{7,6,5,4,3,2,1}, 5));
    }
}
