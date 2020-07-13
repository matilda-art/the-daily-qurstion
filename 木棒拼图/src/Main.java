import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @program: 木棒拼图
 * @description
 * 有一个由很多木棒构成的集合，每个木棒有对应的长度。
 * 请问能否用集合中的这些木棒以某个顺序首尾相连构成一个面积大于 0 的简单多边形且所有木棒都要用上，简单多边形即不会自交的多边形。
 * 初始集合是空的，有两种操作，要么给集合添加一个长度为 L 的木棒，要么删去集合中已经有的某个木棒。
 * 每次操作结束后你都需要告知是否能用集合中的这些木棒构成一个简单多边形。
 * @author: matilda
 * @create: 2020-07-13 22:02
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int num = 0;
        int j = 0;
        int max = 0;

        List<Integer> list = new ArrayList<>();
        while (j++ < n) {
            int i = sc.nextInt();
            int l = sc.nextInt();
            sc.nextLine();
            if (i == 1) {
                list.add(l);
                num += l;
            } else {
                list.remove(list.indexOf(l));
                num -= l;
            }
            Collections.sort(list);

            if(list.size() > 0){
                max = list.get(list.size()-1);
            }
            if (num - max <= max) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}