package datastructure.stack;

/**
 * @author hejiawei
 * @date 2020/11/5 11:18
 */
public class MainStack {

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();

        for (int i = 0; i < 5; i++) {
            //向栈中推送元素
            arrayStack.push(i);
            System.out.println(arrayStack);
        }

        //向栈中取出元素
        arrayStack.pop();
        System.out.println(arrayStack);

    }


}
