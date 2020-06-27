import java.util.Scanner;

/**
 * @program: 小易的升级之路
 * @description
 * 小易经常沉迷于网络游戏。
 * 有一次他在玩一个打怪升级的游戏，他的角色初始能力为a。
 * 在接下来的一段时间里，他将会依次遇见n个怪物，每个怪物的防御力为b1,b2,b3...bn。
 * 如果遇到的怪物防御力bi小于等于小易的当前能力值c，那么他就能轻松打败怪物，并且使自己的能力值增加bi
 * 如果bi大于c，那他也能打败怪物，但他的能力值只能增加bi和c的最大公约数。
 * 那么在一系列的锻炼后，小易的最终能力值为多少？
 *
 * 输入描述：
 * 第一行：两个整数，表示怪物的数量和a表示小易的初始能力值
 * 第二行：n个整数，b1,b2...bn(1<=bi<=n)表示每个怪物的防御力
 *
 * @author: matilda
 * @create: 2020-06-26 22:03
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();//怪物的数量
            int a = scanner.nextInt();//小易的初始能力值
            int[] b = new int[n];//怪物的防御力

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();//输入每个怪物的防御力
                if (a > b[i]) {
                    a += b[i];
                } else {
                    a += getMax(a, b[i]);
                }
            }
            System.out.println(a);
        }
    }

    //获取对应的最大公约数
    public static int getMax(int n,int m){
        if (m%n == 0){
            return n;
        }else {
            return getMax(m%n,n);
        }
    }
}
