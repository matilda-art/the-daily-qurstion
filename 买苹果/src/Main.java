import java.util.Scanner;

/**
 * @program: 买苹果
 * @description
 * 商贩只提供6个每袋和8个每袋（包装不可拆分）
 * 若当前只想购买恰好n个苹果，想购买尽量少的袋数方便携带。
 * 如果不能购买恰好n个苹果，将不会购买。
 * @author: matilda
 * @create: 2020-06-04 10:31
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 5){
            System.out.println(-1);
        }
        if (n%8 == 0){
            System.out.println(n/8);
        }else if ((n%8)%2 == 0 && n!= 10){
            System.out.println(n/8 + 1);
        }else {
            System.out.println(-1);
        }
    }
}
