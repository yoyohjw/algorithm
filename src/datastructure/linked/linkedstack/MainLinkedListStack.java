package datastructure.linked.linkedstack;

import datastructure.arrays.stack.ArrayStack;

public class MainLinkedListStack {

    public static void main(String[] args) {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();

        for (int i = 0; i < 5; i++) {
            //向栈中推送元素
            linkedListStack.push(i);
            System.out.println(linkedListStack);
        }

        //向栈中取出元素
        linkedListStack.pop();
        System.out.println(linkedListStack);
    }


}
