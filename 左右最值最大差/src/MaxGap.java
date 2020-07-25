import java.util.*;

/**
 * @program: 左右最值最大差
 * @description
 *
 * 给定一个长度为N(N>1)的整型数组A，可以将A划分成左右两个部分，
 * 左部分A[0..K]，右部分A[K+1..N-1]，K可以取值的范围是[0,N-2]。
 * 求这么多划分方案中，左部分中的最大值减去右部分最大值的绝对值，最大是多少？
 * @author: matilda
 * @create: 2020-07-24 20:49
 **/

public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        int max1 = A[0]; //定义一个最区间最大值初始为A[0]
        int max = Math.abs(A[0] - A[A.length-1]);
        for(int i = 0;i < A.length;i++){
            if(A[i] > max1){
                max1 = A[i];
            }
            int max2 = A[A.length-1]; //每次从n-1开始在右区间找最大值
            for(int j = A.length-1;j > i;j--){
                if(A[j] > max2){
                    max2 = A[j];
                }
                if(Math.abs(max1 - max2) > max){
                    max = Math.abs(max1 - max2);
                }
            }
        }
        return max;
    }
}