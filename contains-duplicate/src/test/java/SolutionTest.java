import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test(){
        Assertions.assertTrue(new Solution().containsDuplicate(new int[]{1, 2, 3, 1}));
        Assertions.assertFalse(new Solution().containsDuplicate(new int[]{1, 2, 3, 4}));
        Assertions.assertTrue(new Solution().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
