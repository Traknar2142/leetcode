import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test(){
        Assertions.assertEquals(3, new Solution().heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
