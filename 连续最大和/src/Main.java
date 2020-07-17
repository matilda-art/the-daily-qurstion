import java.util.Scanner;

/**
 * @program: 连续最大和
 * @description
 * 一个数组有N个元素，求连续子数组的最大和。
 * 例如：[-1,2,1],和最大的连续子数组为[2,1]，其和为3
 *
 * 输入描述：
 * 输入为两行，第一行一个整数n(1<=n<=100000),表示一共有n个元素
 * 第二行为n个数，即每个元素，每个元素都在32位int范围内，以空格分隔
 * @author: matilda
 * @create: 2020-07-17 14:23
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE,temp = 0;
            for (int i = 0; i < n; i++) {
                temp += sc.nextInt();
                if (temp > max){
                    max = temp;
                }
                //清零
                if (temp <= 0)
                    temp = 0;
            }
            System.out.println(max);
        }
    }
}
