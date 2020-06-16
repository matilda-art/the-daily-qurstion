import java.util.Scanner;

/**
 * @program: 尼科彻斯定理
 * @description
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 * 例如：
 * 1^3=1
 * 2^3=3+5
 * 3^3=7+9+11
 * 4^3=13+15+17+19
 *
 *
 * 思路：
 * m的立方都可以写成m个连续奇数之和:
 * 当所给数m为奇数时，那么这m个连续的奇数中的第一个数为：m*m-2(m/2)
 * 当所给数m为偶数时，那么这m个连续的奇数中的第一个数为：m*m-2(m/2)+1
 * @author: matilda
 * @create: 2020-06-16 14:42
 **/
public class Main {

    public static String GetSequeOddNum(int m){
        String result = "";
        int start = 0;//第一个数
        if (m % 2 != 0){
            start = m * m - 2 * (m / 2);//奇数
        }else {
            start = m * m - 2 * (m / 2) + 1;//偶数
        }
        result += start;

        for (int i = 1; i < m; i++) {
            result += "+" + (start + 2 * i);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            System.out.println(GetSequeOddNum(m));
        }
    }
}
