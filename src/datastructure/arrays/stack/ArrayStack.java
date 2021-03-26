package datastructure.arrays.stack;

import datastructure.arrays.array.Array;

/**
 * @author hejiawei
 * @date 2020/11/4 15:51
 */
public class ArrayStack<E> implements Stack<E> {

    Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayStack() {
        array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    /**
     * 取出 - 会删除元素
     * @return
     */
    @Override
    public E pop() {
        return array.removeLast();
    }

    /**
     * 取出 但不删除元素
     * @return
     */
    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("stack");
        str.append('[');
        for (int i = 0; i < array.getSize(); i++) {
            str.append(array.get(i));
            if (i != array.getSize() - 1) {
                str.append(",");
            }
        }
        str.append("] top");
        return str.toString();
    }


}
