import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: 删数
 * @description
 * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行。
 * 求最后一个被删掉的数的原始下标位置。
 *
 * 以8个数（N=7）为例：
 * {0,1,2,3,4,5,6,7},0->1->2(删除)->3->4->5(删除)->6->7->0(删除)
 * 如此循环直至最后一个数被删除。
 *
 * 输入描述：每组数据为一行一个整数n(小于等于1000)，为数组成员数。
 *         如果大于1000，则对a[999]进行计算。
 * @author: matilda
 * @create: 2020-06-09 14:51
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();//总共n个数
            if (n > 1000){
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1){
                i = (i + 2) % list.size();//取下标
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
