class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode sortedListNode = new ListNode();

        //////////////////////////////////////////////////
        ListNode prev = sortedListNode; //ссылка на отсортированный лист
        ListNode curr = head; //указатель на конкретную ноду
        ListNode next; // указатель на следующую ноду
        ///////////////////////////////////////////////////

        while (curr != null) {
            next = curr.next;

            while (prev.next != null && prev.next.val < curr.val) {//[3,5,6,1,4,2]
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;

            prev = sortedListNode;

            curr = next;
        }

        return sortedListNode.next;
    }
}