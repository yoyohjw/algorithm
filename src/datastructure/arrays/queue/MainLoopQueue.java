package datastructure.arrays.queue;

/**
 * @author hejiawei
 * @date 2020/11/11 13:49
 */
public class MainLoopQueue {

    public static void main(String[] args) {
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            //向队列存入元素
            loopQueue.enqueue(i);
            System.out.println(loopQueue);

            if (i % 3 == 2) {
                System.out.println("下标为：" + i);
                //取出元素
                loopQueue.dequeue();
                System.out.println(loopQueue);
            }

        }


    }


}
