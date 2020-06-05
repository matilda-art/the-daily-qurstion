import java.util.Stack;

/**
 * @program: 用两个栈实现队列
 * @description
 * @author: matilda
 * @create: 2020-06-05 10:50
 **/

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (empty()){
            return -1;
        }
        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean empty() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        }
        return false;
    }
}
