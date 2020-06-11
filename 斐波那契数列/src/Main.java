import java.util.Scanner;

/**
 * @program: 斐波那契数列
 * @description
 * 斐波那契数列是这样定义的：
 * F[0] = 0
 * F[1] = 1
 * foreach i >= 2 : F[i] = F[i-1] + F[i-2]
 * 因此斐波那契数列形如：0,1,1,2,3,5,8,13，……，在斐波那契数列中的数我们称为斐波那契数。
 * 给你一个N，你想让其变为一个斐波那契数，每一步你可以把当前数组X变为X-1或者X+1。
 * 现在给你一个数N求最少需要多少步可以变为斐波那契数。
 *
 * 思路：暴力求解
 * @author: matilda
 * @create: 2020-06-11 14:53
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = f1 + f2;

        while (true) {
            if (f2 == n) {
                System.out.println(0);
                break;
            }else if (f2 > n) {
                if (Math.abs(f2 - n) > Math.abs(f1 - n)) {
                    System.out.println(Math.abs(f1 - n));
                } else {
                    System.out.println(Math.abs(f2 - n));
                }
                break;
            }
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
    }
}
