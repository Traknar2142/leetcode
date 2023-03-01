import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        ListNode listNode = convertToListNode(new int[]{3,5,6,1,4,2});
        ListNode actual = new Solution().insertionSortList(listNode);
        int[] expected = new int[]{1,2,3,4,5,6};
        int[] actualArray = convertToIntArray(actual);

        Assertions.assertEquals(expected,actualArray);
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

    private int[] convertToIntArray(ListNode listNode) {
        int countOfNodes = getContOfNodes(listNode);
        int[] arr = new int[countOfNodes];
        ListNode currentNode = listNode;
        ListNode nextNode;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = currentNode.val;
            currentNode = currentNode.next;
        }
        return arr;
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
