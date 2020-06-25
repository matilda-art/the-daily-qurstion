/**
 * @program: 链式A+B
 * @description
 * 有两个用链式表示的整数，每个结点包含一个数位。
 * 这些数位是反向存放的，也就是个位排在链表的首部。
 * 编写函数对这两个整数求和，并用链表形式发挥结果。
 * 给定两个链表ListNode* A,ListNode* B，请返回A+B的结果（ListNode*）
 * @author: matilda
 * @create: 2020-06-25 21:39
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        if (a == null){
            return b;
        }
        if (b == null){
            return a;
        }

        ListNode p1 = a;
        ListNode p2 = b;
        ListNode head = new ListNode(0);
        ListNode p = head;
        int sum = 0;

        while (p1 != null || p2 != null || sum != 0){
            if (p1 != null){
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }
            p.next = new ListNode(sum % 10);
            sum /= 10;
            p = p.next;
        }
        return head.next;
    }
}
