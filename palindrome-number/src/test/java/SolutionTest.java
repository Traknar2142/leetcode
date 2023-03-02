import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test() {
        Assertions.assertTrue(new Solution().isPalindrome(123040321));
        Assertions.assertTrue(new Solution().isPalindrome(121));
        Assertions.assertFalse(new Solution().isPalindrome(-121));
        Assertions.assertFalse(new Solution().isPalindrome(10));
    }
}
