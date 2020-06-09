import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: n个数里最小的k个
 * @description
 *
 * 输入描述：每个测试输入包含空格分割的n+1个整数，最后一个整数为k值，n不超过100。
 * 输出描述：输出n个整数里最小的k个数，升序输出。
 *
 * @author: matilda
 * @create: 2020-06-09 15:25
 **/

// 快排的思想，找到下表为k的位置，则可知，前k小的都在左边，排序输出
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] s = str.split(" ");
            int[] num = new int[s.length-1];
            for (int i = 0; i < s.length-1; i++) {
                num[i] = Integer.parseInt(s[i]);
            }

            int k = Integer.parseInt(s[s.length-1]);
            int start = 0;
            int end = num.length-1;
            int index = qSort(num,start,end);

            while (index != k){
                if (index > k){
                    end = index - 1;
                    index = qSort(num,start,end);
                }else {
                    start = index + 1;
                    index = qSort(num,start,end);
                }
            }
            Arrays.sort(num,0,k);
            for (int i = 0; i < k; i++) {
                System.out.print(num[i]+" ");
            }
        }
    }

    public static int qSort(int[] num,int start,int end){
        int par = num[start];
        while (start < end){
            while (start < end && num[end] >= par){
                end--;
            }
            num[start] = num[end];
            while (start < end && num[start] < par){
                start++;
            }
            num[end] = num[start];
        }
        num[start] = par;
        return start;
    }
}
