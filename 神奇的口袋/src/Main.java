import java.util.Scanner;

/**
 * @program: 神奇的口袋
 * @description
 * 有一个神奇的口袋，总的容积是40，用这个口袋可以编出一些物品，这些物品的总体积必须是40.
 * 现在John有n个想要得到的物品，每个物品的体积分别的a1,a2……an。
 * John可以从这些物品中选择一些，如果选择出的物品的总体积是40。
 * 那么利用这个神奇的口袋可以得到这些物品。
 * 请问：有多少种不同的选择物品的方式？
 *
 * 思路：用递归解决
 * @author: matilda
 * @create: 2020-06-05 10:24
 **/
public class Main {

    static int count = 0;//有多少种选择物品的方式
    static int n;//物品的种类
    static int[] array;//口袋
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            n = scanner.nextInt();
            array = new int[n+1];

            for (int i = 1; i <= n; i++) {
                array[i] = scanner.nextInt();
            }
        }
        count(40,n);
        System.out.println(count);
    }

    public static void count(int s,int n){
        //s表示背包剩下的容量大小，n为剩下的物品数量
        if (s == 0){
            count++;
        }
        if (s <= 0 || (s > 0 && n < 0)){
            return;
        }
        count(s-array[n], n-1);
        count(s,n-1);
    }
}
