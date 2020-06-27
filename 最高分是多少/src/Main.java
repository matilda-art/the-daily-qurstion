import java.util.Scanner;

/**
 * @program: 最高分是多少
 * @description
 * 老师想知道从某某同学当中，分数最高的是多少
 * 现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩
 *
 * 输入描述：
 * 第一行：两个正整数N和M，分别代表学生的数目和操作的数目。学生ID编号从1编到N
 * 第二行：包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生成绩
 * 接下来又M行
 * 第一行有一个字符C(只取‘Q’或‘U’)，和两个正整数A,B,
 * 当C为‘Q’的时候，表示这是一条询问的操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
 * 当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B
 * @author: matilda
 * @create: 2020-06-27 16:54
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 0, M = 0;

        while (scanner.hasNext()) {
            N = scanner.nextInt();
            M = scanner.nextInt();

            int[] score = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                score[i] = scanner.nextInt();
            }

            while (M-- != 0) {
                String c = scanner.next();
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                if (c.equals("Q")) {
                    if (A > B) {
                        int temp = A;
                        A = B;
                        B = temp;
                    }
                    int max = findMax(score, A, B);
                    System.out.println(max);
                } else if (c.equals("U")) {
                    score[A] = B;
                }
            }
        }
    }

    private static int findMax(int[] score, int left, int right) {
        if (left == right) {
            return score[left];
        }
        int max = score[left];
        for (int i = left + 1; i <= right; i++) {
            if (score[i] > max)
                max = score[i];
        }
        return max;
    }
}
