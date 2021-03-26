package datastructure.linked.linkedqueue;

import datastructure.arrays.queue.ArrayQueue;

public class MainLinkedListQueue {


    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            //向队列存入元素
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                System.out.println("下标为：" + i);
                //取出元素
                queue.dequeue();
                System.out.println(queue);
            }

        }
    }

}
