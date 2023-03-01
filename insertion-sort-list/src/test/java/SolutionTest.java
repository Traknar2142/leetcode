import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        ListNode listNode = convertToListNode(new int[]{-1,5,3,4,0});
        ListNode actual = new Solution().insertionSortList(listNode);
        String expected = "-1,0,3,4,5,";
        String actualStr = convertToIntString(actual);

        Assertions.assertEquals(expected,actualStr);
    }

    private ListNode convertToListNode(int[] arr) {
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

    private String convertToIntString(ListNode listNode) {
        int countOfNodes = getContOfNodes(listNode);
        int[] arr = new int[countOfNodes];
        ListNode currentNode = listNode;
        ListNode nextNode;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfNodes; i++) {
            sb.append(currentNode.val).append(",");
            currentNode = currentNode.next;
        }
        return sb.toString();
    }

    private int getContOfNodes(ListNode listNode) {
        int count = 1;
        while (listNode.next != null) {
            ListNode pointer = listNode.next;
            if (pointer != null) {
                count++;
                listNode = pointer;
            }
        }
        return count;
    }
}
