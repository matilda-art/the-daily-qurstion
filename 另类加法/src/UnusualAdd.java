/**
 * @program: 另类加法
 * @description
 * 请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。
 * 给定两个int A和B。请返回A+B的值。
 *
 * 思路：
 * 位的异或运算和求和结果一致，而位的与运算和求进位的结果一致。
 * @author: matilda
 * @create: 2020-06-17 10:37
 **/

public class UnusualAdd {
    public int addAB(int A,int B){
        if (B != 0){//5+6=11
            int a = A^B;//101 110  ->011
            int b = (A&B)<<1;//1000
            return a+b;//->1011
        }else {
            return A;
        }
    }
}
