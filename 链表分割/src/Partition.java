/**
 * @program: 链表分割
 * @description
 * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前。
 * 给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。
 * 注意：分割以后保持原来的数据顺序不变
 *
 * @author: matilda
 * @create: 2020-06-22 19:54
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode cur = pHead;
        ListNode next = null;

        while (cur != null) {
            next = cur.next;
            if (cur.val < x) {
                l1.next = cur;
                cur.next = null;
                l1 = l1.next;
            } else {
                l2.next = cur;
                cur.next = null;
                l2 = l2.next;
            }
            cur = next;
        }
        l1.next = h2.next;
        return h1.next;
    }
}
