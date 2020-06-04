import java.util.Scanner;

/**
 * @program: 删除公共字符
 * @description
 * 输入两个字符串，从第一字符串中删除第二个字符串中的所有字符。
 * 例如：输入“They are students.”和“aeiou”
 *      则删除之后的第一个字符串变成“Thy r stdnts.”
 * @author: matilda
 * @create: 2020-06-04 10:57
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            char[] ch = scanner.nextLine().toCharArray();
            String str = scanner.nextLine();

            for (int i = 0; i < ch.length; i++) {
                if (!str.contains(String.valueOf(ch[i]))){
                    System.out.print(ch[i]);
                }
            }
            System.out.println();
        }
    }
}
