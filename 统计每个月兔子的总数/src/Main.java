import java.util.Scanner;

/**
 * @program: 统计每个月兔子的总数
 * @description
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子
 * 假如兔子都不死，问每个月的兔子总数为多少？
 *
 * monthCount 第几个月
 * return 兔子总数
 * @author: matilda
 * @create: 2020-06-25 17:43
 **/
import java.util.Scanner;

public class Main {
    public static int getTotalCount(int monthCount){
        if (monthCount == 1 || monthCount == 2){
            return 1;
        }
        return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int monthCount = scanner.nextInt();
            System.out.println(getTotalCount(monthCount));
        }
    }
}