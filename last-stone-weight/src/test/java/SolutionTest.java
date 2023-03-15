import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test(){
        Assertions.assertEquals(1, new Solution().lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
