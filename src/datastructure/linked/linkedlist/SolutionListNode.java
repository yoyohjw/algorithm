package datastructure.linked.linkedlist;


public class SolutionListNode {

    public int val;
    public SolutionListNode next;

    public SolutionListNode(int val) {
        this.val = val;
    }

    public SolutionListNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("非法参数");
        }

        this.val = arr[0];
        SolutionListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new SolutionListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SolutionListNode cur = this;
        while (cur != null) {
            sb.append(cur.val + "->");
            cur = cur.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
