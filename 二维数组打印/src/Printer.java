/**
 * @program: 二维数组打印
 * @description
 * 有一个二维数组(n * n), 写程序实现从右上角到左下角沿主对角线方向打印。
 * 给定一个二位数组arr及题目中的参数n，请返回结果数组。
 *
 *
 * 1. 沿着主对角线打印，所以每次打印之后x与y都要加1，直到x或y超出边界。
 * 2. 每轮遍历的起始点，是遵循(0,n-1)...（0,0）...（n-1,0）。
 *    也就是y先减小到0，然后x增加到n-1。所以遍历的终止条件是startX >= n
 * @author: matilda
 * @create: 2020-07-15 20:33
 **/

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        int[] res = new int[n*n];
        int index = 0;
        int startX = 0;
        int startY = n-1;
        while(startX < n){
            int x = startX;
            int y = startY;
            while(x < n && y < n)
                res[index++] = arr[x++][y++];
            if(startY > 0)
                startY--;
            else
                startX++;
        }
        return res;
    }
}
