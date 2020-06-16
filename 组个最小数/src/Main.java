import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: 组个最小数
 * @description
 * @author: matilda
 * 给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。
 * 目标是使得最后得到的数尽可能小（注意0不能做首位）。
 * 例如：
 * 给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。
 * @create: 2020-06-16 11:17
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        //输入0-9这10个数字出现的个数
        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            list.add(n);
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != 0){
                sb.append(i);
                list.set(i,list.get(i)-1);
                break;
            }
        }

        //将0以外的全部输出
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0){
                for (int j = 0; j < list.get(i); j++) {
                    sb.append(i);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
