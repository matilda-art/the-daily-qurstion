import java.util.Scanner;

/**
 * @program: 汽水瓶
 * @description
 * 某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？
 * 答案是5瓶，
 *
 * 方法如下：
 * 先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
 * 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 *
 * @author: matilda
 * @create: 2020-06-02 10:57
 **/
public class Main {

    public static int drink(int n) {
        int total = 0;//最多能换total瓶饮料
        while (n > 2) {
            total = total +n/3;
            n = n/3 + n%3;
        }
        if (n == 2){
            total++;//向商家借一瓶饮料
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(drink(n));
        }
    }
}