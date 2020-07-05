import java.util.Scanner;

/**
 * @program: 说反话
 * @description
 * 给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
 *
 * 输入描述：
 * 字符串由若干个单词和若干空格组成，其中单词是由英文字母（大小写有区分）组成的字符串
 * 单词之间用1个空格分开，输入保证句子末尾没有多余的空格
 * @author: matilda
 * @create: 2020-07-05 20:57
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            //从后往前打印
            System.out.print(arr[arr.length-1-i] + " ");
        }
    }
}
