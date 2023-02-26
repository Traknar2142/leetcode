import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test(){
        Assertions.assertEquals(3, new Solution().pivotIndex(new int[]{1,7,3,6,5,6}));
        Assertions.assertEquals(-1, new Solution().pivotIndex(new int[]{1,2,3}));
        Assertions.assertEquals(0, new Solution().pivotIndex(new int[]{2,1,-1}));
        Assertions.assertEquals(2, new Solution().pivotIndex(new int[]{-1,-1,-1,-1,-1,0}));
    }
}
