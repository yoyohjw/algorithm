package datastructure.arrays.queue;

/**
 * @author hejiawei
 * @date 2020/11/5 15:32
 *
 * 队列：先进先出
 *
 */
public interface Queue<E> {

    int getSize();
    boolean isEmpty();

    /**
     * 添加数据
     * @param e
     */
    void enqueue(E e);

    /**
     * 取出数据
     * @return
     */
    E dequeue();
    E getFront();

}
