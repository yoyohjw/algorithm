package datastructure.linked.linkedlist;

/**
 * 链表算法 ： 删除链表中给定val的值
 * <p>
 * 给定val = 6;
 * 给定链表  1->2->3->6->5->6;
 * 输出      1->2->3->5
 */
public class Solution {

    public SolutionListNode removeElements(SolutionListNode head, int val) {
        //解答1 - 不设置虚拟头结点
        while (head != null && head.val == val) {
            SolutionListNode del = head;
            head = head.next;
            del.next = null;
        }

        if (head == null) {
            return head;
        }

        SolutionListNode prev = head;
        while(prev.next != null) {
            if (prev.next.val == val) {
                //删除
                SolutionListNode del = prev.next;
                prev.next = del.next;
                del.next = null;
            } else {
                prev = prev.next;
            }
        }

        return head;

    }


    public SolutionListNode removeElements2(SolutionListNode head, int val) {
        //解答2 - 设置虚拟头结点
        SolutionListNode dummyHead = new SolutionListNode(-1);
        dummyHead.next = head;

        SolutionListNode prev = dummyHead;
        while(prev.next != null) {
            if (prev.next.val == val) {
                //删除
                SolutionListNode del = prev.next;
                prev.next = del.next;
                del.next = null;
            } else {
                prev = prev.next;
            }
        }

        return dummyHead.next;

    }


}
