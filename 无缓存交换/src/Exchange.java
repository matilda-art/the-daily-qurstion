/**
 * @program: 无缓存交换
 * @description
 * 请编写一个函数，函数内不使用任何临时变量，直接交换两个数的值。
 * 给定一个int数组AB，其第零个元素和第一个元素为待交换的值。
 * 请返回交换后的数组。
 *
 * 思路：异或运算，相同为0，不同为1
 * @author: matilda
 * @create: 2020-06-13 21:49
 **/

public class Exchange {
    public int[] exchangeAB(int[] AB) {
        //AB = [1,2] 001 010
        AB[0] = AB[0]^AB[1];//AB[0] = 3 011
        AB[1] = AB[0]^AB[1];//AB[1] = 1 001
        AB[0] = AB[0]^AB[1];//AB[0] = 2 010
        return AB;
    }
}
