package datastructure.linked.linkedqueue;

import datastructure.arrays.queue.Queue;

/**
 * 尝试用链表实现队列
 * @param <E>
 */
public class LinkedListQueue<E> implements Queue<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    //需要头尾节点
    private Node head, tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        //入队 - 从链表尾部进入
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        //出队 - 从头结点出队
        if (isEmpty()) {
            throw new IllegalArgumentException("cannot dequeue");
        }
        Node node = head;
        head = head.next;
        node.next = null;

        //如果取出的是最后一个元素了，需要维护尾节点
        if (head == null) {
            tail = null;
        }

        return node.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("cannot dequeue");
        }

        return head.e;
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("queue: front ");

        Node cur = head;
        while(cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }

        res.append("tail null");

        return res.toString();
    }
}
