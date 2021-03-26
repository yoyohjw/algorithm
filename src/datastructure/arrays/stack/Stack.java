package datastructure.arrays.stack;

/**
 * @author hejiawei
 * @date 2020/11/4 15:48
 */
public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();

}
