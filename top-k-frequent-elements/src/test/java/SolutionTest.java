import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test(){
        Assertions.assertArrayEquals(new int[]{2, 1}, new Solution().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
        Assertions.assertArrayEquals(new int[]{1}, new Solution().topKFrequent(new int[]{1}, 1));
    }
}
