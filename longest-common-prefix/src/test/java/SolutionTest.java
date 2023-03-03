import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test(){
        Assertions.assertEquals("fl", new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
        Assertions.assertEquals("", new Solution().longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
