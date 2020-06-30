import java.util.Scanner;

/**
 * @program: 数字之和
 * @description
 * 对于给定的正整数n，计算其十进制形式下所有位置数字之和，并计算其平方的各位数字之和。
 * @author: matilda
 * @create: 2020-06-30 17:30
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int x = n*n;
            int sum1 = 0;
            int sum2 = 0;

            while (n > 0){
                sum1 += n%10;//个位
                n = n/10;
            }
            while (x > 0){
                sum2 += x%10;
                x = x/10;
            }
            System.out.println(sum1 + " " + sum2);
        }
    }
}
