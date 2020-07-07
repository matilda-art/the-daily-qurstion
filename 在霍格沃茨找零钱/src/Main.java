import java.util.Scanner;

/**
 * @program: 在霍格沃茨找零钱
 * @description
 * 如果你是哈利波特迷，你会知道膜法世家有它自己的货币系统——
 * 就如海格告诉哈利的：“十七个银西可（Sickle）兑一个加隆（Galleon），
 * 二十九个纳特（Knut）兑一个西可，很容易。“
 * 现在，给定哈利应付的价钱P和他实付的钱A，你的任务是写一个程序来计算他应该被找的零钱
 *
 * 输入描述：
 * 输入在i行中分别给出P和A，格式为“Galleon.Sickle.Knut”,其间用1个空格分隔
 * 这里Galleon是[0,10^7]区间内的整数，Sickle是[0,17)区间内的整数，Knut是[0,29)区间内的整数
 *
 * 输出描述：
 * 在一行中用与输入同样的格式输出哈利应该被找的零钱。如果他没带够钱，那么输出的应该是负数
 * @author: matilda
 * @create: 2020-07-07 21:26
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();//应付的
        String str2 = sc.next();//实付的

        String[] arr1 = str1.split("\\.");

        int a1 = Integer.parseInt(arr1[0]);
        int b1 = Integer.parseInt(arr1[1]);
        int c1 = Integer.parseInt(arr1[2]);

        String[] arr2=str2.split("\\.");

        int a2 = Integer.parseInt(arr2[0]);
        int b2 = Integer.parseInt(arr2[1]);
        int c2 = Integer.parseInt(arr2[2]);

        int num2 = (a2 * 17 + b2) * 29 + c2;
        int num1 = (a1 * 17 + b1) * 29 + c1;

        String res = null;
        if(num2 < num1){
            res = "-" + myFunc(a1,b1,c1,a2,b2,c2);
        }else{
            res = myFunc(a2,b2,c2,a1,b1,c1);
        }
        System.out.print(res);
    }

    public static String myFunc(int a2,int b2,int c2,int a1,int b1,int c1){
        if(c2 < c1){
            c2 += 29;
            b2 -= 1;
        }
        int c = c2 - c1;
        if(b2 < b1){
            b2 += 17;
            a2 -= 1;
        }
        int b = b2 - b1;
        int a = a2 - a1;
        return a + "." + b + "." + c;
    }
}
