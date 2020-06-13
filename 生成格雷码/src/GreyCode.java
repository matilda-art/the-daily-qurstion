/**
 * @program: 生成格雷码
 * @description
 * 在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同，则称这种编码为格雷码。
 * 请编写一个函数，使用递归的方法生成N位的格雷码。
 * 给定一个整数n，请返回n位的格雷码，顺序为从0开始。
 *
 * 思路：
 *     1位格雷码有两个码字
 *     (n+1)位格雷码中的前2^n个码字等于n位格雷码的码字，按顺序书写，加前缀0
 *     (n+1)位格雷码中的后2^n个码字等于n位格雷码的码字，按逆序书写，加前缀1
 *     n+1位格雷码的集合 = n位格雷码集合(顺序)加前缀0 + n位格雷码集合(逆序)加前缀1
 *
 * 格雷码：
 * 1:0,1
 * 2:00,01(顺序)11,10(逆序)
 * 3:000,001,011,010(顺序)110,111,101,100(逆序)
 *     ……以此类推
 *
 * @author: matilda
 * @create: 2020-06-13 22:08
 **/

public class GrayCode {
    public String[] getGray(int n) {
        String[] greyCode = new String[(int) Math.pow(2,n)];

        //一位的格雷码有两个码字
        if (n == 1){
            greyCode[0] = "0";
            greyCode[1] = "1";
            return greyCode;
        }

        //若要得到n位格雷码，需要知道n-1位的格雷码，由此推算
        String[] arr = getGray(n-1);

        //根据n-1位格雷码，通过前2^n位前缀加0，后2^n位前缀加1，求出n位格雷码
        for (int i = 0; i < arr.length; i++) {
            greyCode[i] = "0" + arr[i];//前缀加0
            greyCode[greyCode.length - 1 - i] = "1" + arr[i];//后缀加1
        }
        return greyCode;
    }
}
