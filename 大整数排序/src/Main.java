import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: 大整数排序
 * @description
 * 对N个长度最长可达到1000的数进行排序
 *
 * 输入描述：
 * 输入第一行为一个整数N（1<=N<=100）
 * 接下来的N行每行有一个数，数的长度范围为1<=len<=1000
 * 每个数都是一个正数，并且保证不包含前缀零
 * @author: matilda
 * @create: 2020-07-05 20:40
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            BigInteger[] big = new BigInteger[n];

            for (int i = 0; i < n; i++) {
                big[i] = scanner.nextBigInteger();
            }
            Arrays.sort(big);
            for (int i = 0; i < n; i++) {
                System.out.println(big[i]);
            }
        }
    }
}
