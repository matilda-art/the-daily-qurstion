import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: n个数里出现次数大于等于二分之n的数
 * @description
 * 输入n个整数，输出出现次数大于等于数组长度一半的数
 *
 * 思路：指针遍历
 * @author: matilda
 * @create: 2020-06-06 19:22
 **/
public class Main {

    //如果这个数出现的次数超过一半，排序后数组中间的数必定是它
    //找到中间值
    public static int moreThanHalf(int[] array){
        Arrays.sort(array);
        int i = 0;
        for (int j = array.length-1; i < j; i++) {
            if (array[i] != array[j]) {
                j--;
            }
        }
        return array[i];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");

        int[] array = new int[str.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        System.out.println(moreThanHalf(array));
    }
}
