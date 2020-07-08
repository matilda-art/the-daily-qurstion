/**
 * @program: 上楼梯
 * @description
 * 有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。
 * 请实现一个方法，计算小孩有多少种上楼的方式。
 * 为了防止溢出，请将结果Mod 1000000007
 * @author: matilda
 * @create: 2020-07-08 21:48
 **/

public class GoUpstairs {
    public int countWays(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        int mod = 1000000007;
        int first = 1;
        int second = 2;
        int third = 4;

        int result = 0;
        for (int i = 4; i <= n; i++) {
            //防止溢出
            result = (first+ second)% mod + third % mod;
            first = second % mod;
            second = third % mod;
            third = result;
        }
        return result % mod;
    }
}