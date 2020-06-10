import java.util.Scanner;

/**
 * @program: 末尾0的个数
 * @description
 * 输入一个正整数n，求n!(即阶乘)末尾有多少个0？
 * 比如：n=10;n!=3628800,所以答案为2
 *
 * 思路：
 * 0的来源是2和5，但由于以2为因数的数较多，所以只考虑因数5
 * @author: matilda
 * @create: 2020-06-10 14:29
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        //计算出每个数里有几个5
        for (int i = n; i >= 5; i--) {
            int tmp = i;
            while (tmp % 5 == 0){
                res++;
                tmp /= 5;
            }
        }
        System.out.println(res);
    }
}
