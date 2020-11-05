package datastructure.queue;

/**
 * @author hejiawei
 * @date 2020/11/5 16:38
 */
public class MainQueue {

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            //向队列存入元素
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                //取出元素
                queue.dequeue();
                System.out.println(queue);
            }

        }


    }


}
