import java.util.Scanner;

/**
 * @program: 守形数
 * @description
 * 守形数是这样一种整数，它的平方的低位部分等于它本身。
 * 比如25的平方是625，低位部分是25，因此25是一个守形数。
 * 编一个程序，判断N是否为守形数。
 *
 * 输出描述：
 * 输出“Yes!”表示N是守形数。输出“No!”表示N不是守形数。
 * @author: matilda
 * @create: 2020-07-02 17:44
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if (String.valueOf(n*n).endsWith(String.valueOf(n)))
                System.out.println("Yes!");
            else
                System.out.println("No!");
        }
    }
}
