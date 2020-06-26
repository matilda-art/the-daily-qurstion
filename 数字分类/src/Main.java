import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @program: 数字分类
 * @description
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字；
 * @author: matilda
 * @create: 2020-06-26 20:59
 **/
public class Main {
    public static void main(String[] args) {
        int i = 0;
        int sum;
        int countA2 = 0;
        int countA4 = 0;
        int countA5 = 0;
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        double A4 = 0;
        int A5 = 0;

        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        sum = input.nextInt();
        int[] array = new int[sum];

        while (i < sum){
            array[i] = input.nextInt();
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            int r = array[j]%5;
            switch (r){
                case 0:
                    if (array[j]%2 == 0){
                        A1 += array[j];
                    }
                    break;
                case 1:
                    A2 += (((countA2%2 == 0) ? (1) : (-1))*array[j]);
                    countA2++;
                    break;
                case 2:
                    A3++;
                    break;
                case 3:
                    A4 += array[j];
                    countA4++;
                    break;
                case 4:
                    list.add(array[j]);
                    A5 = list.get(countA5);
                    countA5++;
                    break;
                default:
                    break;
            }
        }

        if (A1 == 0){
            System.out.print("N"+" ");
        }else {
            System.out.print(A1+" ");
        }

        if (A2 == 0){
            System.out.print("N"+" ");
        }else {
            System.out.print(A2+" ");
        }

        if (A3 == 0){
            System.out.print("N"+" ");
        }else {
            System.out.print(A3+" ");
        }

        if (A4 == 0){
            System.out.print("N"+" ");
        }else {
            DecimalFormat df = new DecimalFormat("0.0");
            System.out.print(df.format(A4/countA4)+" ");
        }

        if (A5 == 0){
            System.out.print("N");
        }else {
            A5 = Collections.max(list);
            System.out.print(A5);
        }
    }
}
