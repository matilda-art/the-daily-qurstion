import java.util.ArrayList;

/**
 * @program: 构建乘积数组
 * @description
 * 给定一个数组A[0,1,…,n-1],请构建一个数组B[0,1,…,n-1]
 * 其中B中的元素B[i]=A[0]*A[1]*…*A[i-1]*A[i+1]*…*A[n-1]
 * 不能使用除法。
 *
 * 思路：
 * B[i]的值可以看做矩阵中每行的乘积。
 * B[i]=A[0]*A[1]*…*A[i-1]*A[i+1]*…*A[n-1]
 * 下三角用连乘可以很容易求得，先算下三角中的连乘，即先计算出B[i]中的一部分，然后将上三角中的数也乘进去。
 * @author: matilda
 * @create: 2020-06-12 10:56
 **/
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        //下三角
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i-1]*A[i-1];
        }
        int temp = 1;
        //上三角
        for (int j = A.length-2; j >= 0; j--) {
            temp *= A[j+1];
            B[j] *= temp;
        }
        return B;
    }
}
