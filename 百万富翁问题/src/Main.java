/**
 * @program: 百万富翁问题
 * @description
 * 一个百万富翁遇到一个陌生人，陌生人找他谈了一个换钱的计划。
 * 该计划如下：
 * 我每天给你10万元，你第一天给我1分钱，第二天给2分钱，第三天给4分钱……
 * 这样交换30天后，百万富翁交出了多少钱？陌生人交出了多少钱？
 * （注意一个是万元，一个是分）
 * @author: matilda
 * @create: 2020-06-19 21:42
 **/
public class Main {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        for (int i = 0; i < 30; i++) {
            n = n+10;
            m = (int) (m+Math.pow(2,i));
        }
        System.out.println(n+" "+m);
    }
}
