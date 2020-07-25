import java.util.*;

/**
 * @program: 顺时针打印矩阵
 * @description
 * 对于一个矩阵，请设计一个算法从左上角(mat[0][0])开始，顺时针打印矩阵元素。
 * 给定int矩阵mat,以及它的维数nxm，请返回一个数组，数组中的元素为矩阵元素的顺时针输出。
 * @author: matilda
 * @create: 2020-07-24 20:54
 **/

public class Printer {
    public int[] clockwisePrint(int[][] mat, int n, int m) {

        // write code here
        int startX = 0;
        int endX = m - 1;
        int startY = 0;
        int endY = n - 1;
        int index = 0;
        int[] result = new int[n * m];

        while (startX <= endX && startY <= endY) {

            // 从左到右打印
            if(startX <= endX){
                for (int i = startX; i <= endX; i++) {
                    result[index++] = mat[startY][i];
                }
            }


            // 从上往下打印

            if (startY < endY) {

                for (int i = startY + 1; i <= endY; i++) {
                    result[index++] = mat[i][endX];
                }
            }

            // 从右往左打印
            if (startX < endX && endY > startY) {
                for (int i = endX - 1; i >= startX; i--) {
                    result[index++] = mat[endY][i];
                }
            }

            // 从下往上打印
            if (startY < endY && endX > startX) {
                for (int i = endY - 1; i >= startY + 1; i--) {
                    result[index++] = mat[i][startX];
                }
            }

            startX++;
            endX--;
            startY++;
            endY--;
        }
        return result;


    }
}
