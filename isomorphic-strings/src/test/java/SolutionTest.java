import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test(){
        Assertions.assertTrue(new Solution().isIsomorphic("egg","add"));
        Assertions.assertFalse(new Solution().isIsomorphic("foo","bar"));
        Assertions.assertTrue(new Solution().isIsomorphic("paper","title"));
    }
}
