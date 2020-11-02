package datastructure.array;

/**
 * @author hejiawei
 * @date 2020/11/2 11:02
 */
public class Array {

    private int[] data;
    private int size;

    //构造函数，传入数组的容量capacity构造数组array
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    //无参构造，默认数组的容量capacity容量为10
    public Array() {
        this(10);
    }

    //获取数组中的元素个数
    public int getSize() {
        return size;
    }

    //获取数组容量
    public int getCapacity() {
        return data.length;
    }

    //返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //向所有元素后添加一个新元素
    public void addLast(int e) {
//        if (size == data.length) {
//            throw new IllegalArgumentException("addLast failed, array is full");
//        }
//
//        data[size] = e;
//        size++;
        insert(size, e);
    }

    //从头部添加一个新元素
    public void addFirst(int e) {
        insert(0, e);
    }

    //在第index位置插入元素
    public void insert(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("insert failed, array is full");
        }
        //判断下标是否符合
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("insert failed, required index >= 0 || index <= size");
        }
        //将前面下标的元素往后挪一位
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }

    //获取index下标的元素
    public int get(int index) {
        //判断下标是否符合
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("get failed, index is illegal");
        }

        return data[index];
    }

    //更新下标为index的元素
    public void set(int index, int e) {
        //判断下标是否符合
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("set failed, index is illegal");
        }

        data[index] = e;

    }

    //查找是否有元素e
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (e == data[i]) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素下标，不存在则返回-1
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (e == data[i]) {
                return i;
            }
        }
        return -1;
    }

    //从数组中删除某个元素，并返回删除元素
    public int remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("remove failed, index is illegal");
        }

        int ret = data[index];

        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }

    //从数组中删除第一个元素
    public int removeFirst() {
        return remove(0);
    }

    //从数组中删除最后一个元素
    public int removeLast() {
        return remove(size - 1);
    }

    //删除某个元素
    public void removeElement(int e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    //覆盖toString() 在system.out.println时 打印arr信息
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(",");
            }
        }
        res.append(']');
        return res.toString();
    }

}
