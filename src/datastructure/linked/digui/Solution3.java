package datastructure.linked.digui;

import datastructure.linked.linkedlist.SolutionListNode;

/**
 * @author hjw
 * @createTime 2021/4/9 15:21
 * @description
 */
public class Solution3 {

    public SolutionListNode removeElements(SolutionListNode head, int val) {
        //如果链表为空，直接返回Null
        if (head == null) {
            return null;
        }

        //递归链表，逐层递归
        SolutionListNode res = removeElements(head.next, val);
        //递归到最后一层，判断节点值是否与要删除元素值相同
        if (head.val == val) {
            //相同，直接返回res  相当于是   head ->  *******
            //                            res -> res1 -> res2
            return res;
        } else {
            //如果不同，则将头节点指向res
            //相当于  head -> res -> res1 -> res2
            head.next = res;
            return head;
        }

    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 6, 3, 4, 5, 6};
        SolutionListNode head = new SolutionListNode(nums);
        System.out.println(head);

        SolutionListNode res = (new Solution3()).removeElements(head, 6);
        System.out.println(res);

    }

}
