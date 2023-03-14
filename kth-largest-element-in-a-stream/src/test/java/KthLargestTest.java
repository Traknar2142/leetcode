import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestTest {
    @Test
    void test(){
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        Assertions.assertEquals(4, kthLargest.add(3));
        Assertions.assertEquals(5, kthLargest.add(5));
        Assertions.assertEquals(5, kthLargest.add(10));
        Assertions.assertEquals(8, kthLargest.add(9));
        Assertions.assertEquals(8, kthLargest.add(4));
    }
    @Test
    void test2(){
        KthLargest kthLargest = new KthLargest(1, new int[]{});
        Assertions.assertEquals(-3, kthLargest.add(-3));
        Assertions.assertEquals(-2, kthLargest.add(-2));
        Assertions.assertEquals(-2, kthLargest.add(-4));
        Assertions.assertEquals(0, kthLargest.add(0));
        Assertions.assertEquals(4, kthLargest.add(4));
    }
    @Test
    void test3(){
        KthLargest kthLargest = new KthLargest(2, new int[]{0});
        Assertions.assertEquals(-1, kthLargest.add(-1));
        Assertions.assertEquals(0, kthLargest.add(1));
        Assertions.assertEquals(0, kthLargest.add(-2));
        Assertions.assertEquals(0, kthLargest.add(-4));
        Assertions.assertEquals(1, kthLargest.add(3));
    }
    @Test
    void test4(){
        KthLargest kthLargest = new KthLargest(3, new int[]{5,-1});
        Assertions.assertEquals(-1, kthLargest.add(2));
        Assertions.assertEquals(1, kthLargest.add(1));
        Assertions.assertEquals(1, kthLargest.add(-1));
        Assertions.assertEquals(2, kthLargest.add(3));
        Assertions.assertEquals(3, kthLargest.add(4));
    }
}
