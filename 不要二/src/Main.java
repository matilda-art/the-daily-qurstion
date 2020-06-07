import java.util.Scanner;

/**
 * @program: 不要二
 * @description
 * 小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。
 * 每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
 * 对于两个格子坐标（x1,y1）,(x2,y2)的欧几里得距离为：
 * ((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))的算术平方根
 * 小易想知道最多可以放多少块蛋糕在网格盒子里。
 *
 *
 * 思路：数学思想，每四行确定
 * @author: matilda
 * @create: 2020-06-07 20:01
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();//列
        int n = scanner.nextInt();//行
        int evenICount = (n / 4) * 2 + (n % 4 < 2 ? n % 4 : 2);//分了奇数行和偶数行
        int oddICount = ((n - 2) / 4) * 2 + ((n - 2) % 4 < 2 ? (n - 2) % 4 : 2);
        int count = m / 4 * (evenICount + oddICount) * 2;//通过其确定的行数来确定
        //余数123三种情况
        if (m % 4 > 0){
            count = count + evenICount;
        }
        if (m % 4 > 1){
            count = count + evenICount;
        }
        if (m % 4 > 2){
            count = count + oddICount;
        }
        System.out.println(count);
    }
}
