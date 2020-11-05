package datastructure.stack;

import datastructure.array.Array;

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

    @Override
    public E pop() {
        return array.removeLast();
    }

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
