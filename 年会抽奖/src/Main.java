import java.util.Scanner;

/**
 * @program: 年会抽奖
 * @description
 * 获奖规则：
 * 1.首先，所有人员都将一张写有自己名字的字条放入抽奖箱中
 * 2.待所有字条加入完毕，每人从箱中取一个字条
 * 3.如果抽到的字条上写的就是自己的名字，那么“恭喜你，中奖了！”
 * 现在告诉你参加晚会的人数，请你计算有多少概率会出现无人获奖？
 *
 * 输出描述：
 * 对应每一组数据，以“xx.xx%”的格式输出发生无人获奖的概率
 * @author: matilda
 * @create: 2020-07-03 12:02
 **/

public class Main {
    //每个人都拿不到自己名字的可能
    public static float count(int n){
        if (n == 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
        return (n-1)*(count(n-1) + count(n-2));
    }

    //求阶乘，得分母
    public static float probability(int n){
        if (n == 0)
            return 1;
        return n*probability(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            float result = (count(n)/probability(n))*100;
            System.out.println(String.format("%.2f",result) + "%");
        }
    }
}
