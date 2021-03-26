package datastructure.arrays.stack;

import java.util.Stack;

/**
 * @author hejiawei
 * @date 2020/11/5 14:20
 *
 *
 * 括号匹配，给定一个只包括'[',']','{','}','(',')'的字符串
 * '[]{}()' 则为匹配成功，如果为'[}' 则为不成功
 *
 * 用java原生栈做
 */
public class Solution {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                //放入栈中
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                //从栈顶取出元素，不匹配则返回false
                char topC = stack.pop();
                if (c == ')' && topC != '(') {
                    return false;
                } else if (c == ']' && topC != '[') {
                    return false;
                } else if (c == '}' && topC != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean flag = isValid("{[()]}");
        System.out.println(flag);

        boolean flag2 = isValid("(){}[]");
        System.out.println(flag2);

        boolean flag3 = isValid("()[}{]");
        System.out.println(flag3);
    }

}
