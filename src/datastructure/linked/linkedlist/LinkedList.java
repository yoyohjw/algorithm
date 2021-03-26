package datastructure.linked.linkedlist;

public class LinkedList<E> {

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

    //    private Node head;
    //设置虚拟头结点 - 建立在head之前，是一个null
    private Node dummyHead;
    private int size;

    public LinkedList() {
//        head = null;
        dummyHead = new Node(null, null);
        size = 0;
    }

    //获取链表中元素个数
    public int getSize() {
        return size;
    }

    //返回链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }


    //在链表的index(0-based)位置添加新的元素e
    //在链表中不是一个常用操作，练习用
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed, Illegal index");
        }

//        if (index == 0) {
//            //由于链表头前面已经无节点，相当于在链表头添加新元素
//            addFirst(e);
//        } else {
//            Node prev = head;
//            //找到待插入节点的前一个节点
//            for (int i = 0; i < index - 1; i++) {
//                prev = prev.next;
//            }

        //有了虚拟头结点，就不需要判断index == 0了
        Node prev = dummyHead;
        //因为多了一个虚拟节点，相当于index前移了一位，所以 -1 就不需要了
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }


        //0 -> 1 -> 2(prev) ->  3 -> 4 -> null
        //                   ↓  ↑
        //                     e

        //将新节点 挂接在当中
//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
        //等同上面三行代码
        prev.next = new Node(e, prev.next);
        size++;

    }

    /**
     * 在链表头添加元素
     */
    public void addFirst(E e) {
        //新元素 -> head -> 2 -> 3 -> 4 -> null

        //创建一个新节点
//        Node node = new Node(e);
//        //让新节点指向头元素
//        node.next = head;
//        //将新节点改为头部节点
//        head = node;

        //等同于 - 构造新节点，元素为e，指向现有头结点，并将新节点赋值给head
//        head = new Node(e, head);
//
//        size++;

        add(0, e);

    }


    /**
     * 在链表末尾添加新元素e
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }


    //获得在链表的index(0-based)位置的元素e
    //在链表中不是一个常用操作，练习用
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("get failed");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        return cur.e;

    }

    /**
     * 获取第一个元素
     * @return
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 获取最后一个元素
     * @return
     */
    public E getLast() {
        return get(size);
    }

    //修改在链表的index(0-based)位置的元素e
    //在链表中不是一个常用操作，练习用
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("get failed");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
             cur = cur.next;
        }

        cur.e = e;

    }

    /**
     * 查找链表是否存在元素E
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e == e) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    //删除在链表的index(0-based)位置的元素e
    //在链表中不是一个常用操作，练习用
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("get failed");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        //让前一个节点 指向 被删除元素的 下一个节点
        Node removeNode = prev.next;
        prev.next = removeNode.next;
        removeNode.next = null;

        size--;

        return removeNode.e;

    }

    //删除链表第一个元素
    public E removeFirst() {
        return remove(0);
    }

    //删除链表最后一个元素
    public E removeLast() {
        return remove(size - 1);
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        Node cur = dummyHead.next;
        while(cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("null");

        return res.toString();
    }
}
