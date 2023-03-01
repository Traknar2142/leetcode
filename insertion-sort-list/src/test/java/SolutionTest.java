import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        ListNode listNode = buildListNode(new int[]{1, 2, 3, 4});
        System.out.println(listNode);
    }

    private ListNode buildListNode(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode currentNode = head;
        ListNode nextNode;
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                nextNode = new ListNode(arr[i]);
                currentNode.next = nextNode;
                currentNode = nextNode;
            }
        }
        return head;
    }
}
