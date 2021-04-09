package datastructure.linked.digui;

/**
 * @author hjw
 * @createTime 2021/4/9 14:47
 * @description
 */
public class Sum {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(nums));
    }

    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    //计算从arr[l] 到 arr[n]的总和
    public static int sum(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        }

        return arr[l] + sum(arr, l + 1);
    }


}
