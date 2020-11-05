package datastructure.queue;

/**
 * @author hejiawei
 * @date 2020/11/5 15:32
 */
public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();

}
