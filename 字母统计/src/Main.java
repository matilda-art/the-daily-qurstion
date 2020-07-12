import java.util.Scanner;

/**
 * @program: 字母统计
 * @description
 * 输入一行字符串，计算其中A-Z大写字母出现的次数
 * @author: matilda
 * @create: 2020-07-12 20:05
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.nextLine().toCharArray();
        int[] record = new int[256];
        for (char c : array) {
            record[c]++;
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i+":"+record[i]);
        }
    }
}
