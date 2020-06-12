import java.util.Scanner;

/**
 * @program: 个位数统计
 * @description
 *
 * 给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)
 * 请编写程序统计每种不同的个位数字出现的次数。
 * 例如：给定N = 100311，则有2个0，3个1，和1个3。
 *
 * 思路：遍历每个数字出现的次数
 * @author: matilda
 * @create: 2020-06-12 09:38
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];//代表0-9十个数字
        String n = scanner.nextLine();
        //遍历每个数字，并增加对应数字出现的次数
        for (int i = 0; i < n.length(); i++) {
            //n.charAt(i)-‘0’:两个字符相减实际上是ASCII码对应的数相减
            arr[n.charAt(i)-'0']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                System.out.println(i+":"+arr[i]);
            }
        }
    }
}
