import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program: 数字颠倒
 * @description
 * 输入一个整数，将这个整数以字符串的形式逆序输出。
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * @author: matilda
 * @create: 2020-06-10 14:42
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = ""+n;
        char[] ch = str.toCharArray();
        ArrayList a = new ArrayList<>();
        for (int i = ch.length-1; i >= 0; i--) {
            a.add(ch[i]);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
    }
}
