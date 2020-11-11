package datastructure.queue;

/**
 * @author hejiawei
 * @date 2020/11/6 14:31
 * 循环队列
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front, tail;
    private int size;


    public LoopQueue(int capacity) {
        //循环队列本质上是一个 环形链表
        //因为 tail == front 代表数组为空， 所以为避免 tail == front 又代表了数组为满
        //则设置tail + 1 == front 时，代表数组占满了元素， 因此扩容时需要预留 +1 的容量
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacity() {
        return data.length - 1;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        //当头指针和尾指针相等时即 front == tail，则为空
        return front == tail;
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
            //扩容
            resize(getCapacity() * 2);
        }

        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;

    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from a empty queue");
        }

        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == (getCapacity() / 4) && (getCapacity() / 4) != 0) {
            resize(getCapacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }

        return data[front];
    }


    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            //newData中的值对应data中的值 应该是有一个front的偏移，即data[0] = data[front]
            //由于我们是循环队列，i + front可能会超过data.length，所以我们需要取余，防止越界
            newData[i] = data[(i + front) % data.length];
        }

        data = newData;
        front = 0;
        tail = size;
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d, capacity = %d\n", size, getCapacity()));
        res.append("front [");
        //自己写的
        for (int i = 0; i < size; i++) {
            res.append(data[(i + front) % data.length]);
            if ((i + front + 1) % data.length != tail) {
                res.append(",");
            }
        }
        //视频写的
//        for (int i = front; i != tail; i = (i + 1) % data.length) {
//            res.append(data[i]);
//            if ((i + 1) % data.length != tail) {
//                res.append(",");
//            }
//        }
        res.append("] tail");
        return res.toString();
    }

}
