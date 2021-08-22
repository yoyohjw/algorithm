package datastructure.arrays.stack;

/**
 * @author hejiawei
 * @date 2020/11/4 15:48
 *
 * 栈：先进后出
 *
 */
public interface Stack<E> {

    int getSize();
    boolean isEmpty();

    /**
     * 添加数据
     * @param e
     */
    void push(E e);

    /**
     * 取数据
     * @return
     */
    E pop();

    /**
     * 查看数据
     * @return
     */
    E peek();

}
