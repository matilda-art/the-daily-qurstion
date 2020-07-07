/**
 * @program: 2的个数
 * @description
 * 请编写一个方法，输出0到n（包括n）中数字2出现了几次
 * 给定一个正整数n，请返回0到n的数字中2出现了几次
 * @author: matilda
 * @create: 2020-07-07 21:47
 **/

public class Count2 {
    public int countNumberOf2s(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i;
            int b = n % i;
            //之所以补8，是因为当百位为0，则a/10==(a+8)/10，
            //当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a + 7) / 10 * i + ((a % 10 == 2) ? b + 1 : 0);
        }
        return count;
    }
}
