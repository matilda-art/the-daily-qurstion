import java.math.BigInteger;
import java.util.Scanner;

/**
 * @program: 超长正整数相加
 * @description
 * 请设计一个算法完成两个超长正整数的加法。

 * 接口说明
 *  请设计一个算法完成两个超长正整数的加法。
 *  输入参数：
 *  String addend：加数
 *  String augend：被加数
 *  返回值：加法结果
 *public String AddLongInteger(String addend,String augend){
 *     //在这里实现功能
 *return null;
 *}
 *
 * @author: matilda
 * @create: 2020-06-14 23:40
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            BigInteger num1 = new BigInteger(s1);//采用BigInteger可以直接进行大整数进行计算
            BigInteger num2 = new BigInteger(s2);
            System.out.println(num1.add(num2));
        }
    }
}
