import java.util.Scanner;

/**
 * @program: 统计同成绩学生人数
 * @description
 * 读入N名学生的成绩，将获得某一给定分数的学生人数输出。
 *
 * 输入描述:
 * 测试输入包含若干测试用例，每个测试用例的格式为：
 * 第1行：N
 * 第2行：N名学生的成绩，相邻两数字用一个空格间隔。
 * 第3行：给定分数
 *
 * 当读到N=0时输入结束。其中N不超过1000，成绩分数为（包含）0到100之间的一个整数。
 * @author: matilda
 * @create: 2020-06-18 10:11
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();//输入的学生人数
            if (N == 0){
                return;
            }
            int[] array = new int[N];//保存N个人的分数
            //输入每个学生的成绩
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int T = scanner.nextInt();//输入目标分数
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (T == array[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
