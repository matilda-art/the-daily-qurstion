import java.util.Scanner;

/**
 * @program: 跟奥巴马一起编程
 * @description
 * 在屏幕上画一个正方形。
 * 输入描述：
 * 输入在一行中给出正方形边长N(3<=N<=20)和组成正方形边的某种字符C，间隔一个空格。
 * 输出描述：
 * 输出由给定字符C画出的正方形，但是注意到行间距比例间距大。
 * 所以为了让给过看上去更像正方形，我们输出的行数实际上是列数的50%(四舍五入取整)
 * @author: matilda
 * @create: 2020-06-14 22:44
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String C = scanner.next();

        int row = (int)Math.round(N/2.0);//约为四舍五入

        for (int i = 0; i < row; i++) {//行
            for (int j = 0; j < N; j++) {//列
                if (i == 0 || i == row-1){
                    System.out.print(C);
                }else {
                    if (j == 0 || j == N-1){
                        System.out.print(C);
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
