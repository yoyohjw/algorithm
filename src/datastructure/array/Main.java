package datastructure.array;

/**
 * @author hejiawei
 * @date 2020/10/29 17:19
 */
public class Main {


    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int[] scores = new int[] {100, 99, 66};
        for (int score : scores) {
            System.out.println(score);
        }

        scores[0] = 98;

        for (int score : scores) {
            System.out.println(score);
        }

    }


}
