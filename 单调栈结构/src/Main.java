import java.util.Scanner;
import java.util.Stack;

/**
 * @program: 单调栈结构
 * @description
 * 给定一个不含有重复值的数组 arr，找到每一个 i 位置左边和右边离 i 位置最近且值比 arr[i] 小的位置。返回所有位置相应的信息。
 * @author: matilda
 * @create: 2020-07-20 23:14
 **/

public class Main {
    public static int[][] getNearLessNoRepeat(int[] arr) {
        int[][] res = new int[arr.length][2];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            // 如果当前遍历到的数组的值小，需要弹出
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                int popIndex = stack.pop();
                int leftLessIndex = stack.isEmpty() ? -1 : stack.peek();
                res[popIndex][0] = leftLessIndex;
                res[popIndex][1] = i;
            }
            // 否则当前遍历到的数组的值大，压入不会破坏stack从栈顶到栈底递减的顺序
            stack.push(i);
        }
        // 遍历结束，清算栈中剩下的位置，因为没有当前遍历到的位置，右边位置一律为-1
        while (!stack.isEmpty()) {
            int popIndex = stack.pop();
            int leftLessIndex = stack.isEmpty() ? -1 : stack.peek();
            res[popIndex][0] = leftLessIndex;
            res[popIndex][1] = -1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] data = new int[n];
            for (int i = 0; i < data.length; i++) {
                data[i] = sc.nextInt();
            }
            int[][] result = getNearLessNoRepeat(data);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                sb.append(result[i][0]).append(" ").append(result[i][1]).append('\n');
            }
            System.out.print(sb);
        }
    }
}
