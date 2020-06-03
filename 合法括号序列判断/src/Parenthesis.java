import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: 合法括号序列判断
 * @description
 * 思路：
 * 逐个遍历字符串，遇到'(','{','['就压入栈，遇到')','}',']'则弹出栈顶字符，判断是否合法，最后检查栈是否为空，为空则是合法括号序列。
 * 
 * @author: matilda
 * @create: 2020-06-03 14:39
 **/
public class Parenthesis {

    public boolean chkParenthesis(String A, int n) {
        if (A == null){
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '(' || A.charAt(i) == '[' || A.charAt(i) == '{'){
                stack.push(A.charAt(i));
            }else if (!stack.isEmpty() && A.charAt(i) == ')'){
                if (stack.pop() != '('){
                    return false;
                }
            }else if (!stack.isEmpty() && A.charAt(i) == ']'){
                if (stack.pop() != ']'){
                    return false;
                }
            }else if (!stack.isEmpty() && A.charAt(i) == '}'){
                if (stack.pop() != '}'){
                    return false;
                }
            }else {
                return false;
            }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
