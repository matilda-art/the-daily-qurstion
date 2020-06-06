import java.util.Scanner;

/**
 * @program: 计算糖果
 * @description
 * A,B,C三个人是好朋友，每个人手中都有一些糖果。
 * A-B,B-C,A+B,B+C.这四个数值，每个字母代表每个人所拥有的糖果数。
 * 现在需要通过这四个数值计算出每个人手中有多个糖果，即A,B,C。
 * 这里保证最多只有一组整数A,B,C满足所有题设条件。
 *
 *
 * 思路：数学思想
 * @author: matilda
 * @create: 2020-06-06 18:51
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1,y2,y3,y4;
        float a,b,c;

        while (scanner.hasNext()){
            y1 = scanner.nextInt();
            y2 = scanner.nextInt();
            y3 = scanner.nextInt();
            y4 = scanner.nextInt();

            a = (y1+y3)/2f;
            b = (y3-y1)/2f;
            c = (y4-y2)/2f;

            if ((a-((y1+y3)/2)) != 0){
                System.out.println("No");
                return;
            }
            if ((b-((y3-y1)/2) != 0) || (b != ((y2+y4)/2))){
                System.out.println("No");
                return;
            }
            if ((c-((y4-y2)/2)) != 0){
                System.out.println("No");
                return;
            }
            System.out.println((int)a+" "+(int)b+" "+(int)c);
        }
    }
}
