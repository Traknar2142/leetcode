class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            //итерируемся по списку и ищем, куда можно заинcертить значение
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            //переопределяем ссылки
            curr.next = prev.next;
            //вставляем значение
            prev.next = curr;
            //Переходим к загаловку списка
            prev = dummy;
            //Сдвигаем curr и next дальше по списку на 1
            curr = next;
        }

        return dummy.next;
    }
}