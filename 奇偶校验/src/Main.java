import java.util.Scanner;

/**
 * @program: 奇偶校验
 * @description
 * 输入一个字符串，然后对每个字符进行奇校验，最后输出校验后的二进制数
 * （如‘3’，输出：10110011）
 *
 * 思路：
 * 将数字和字母统一看成是char类型的，所以数字3实际存储时为ASCII码中的‘3’，
 * 其十进制表示是51，转化为二进制表示就是0110011，取最高位为奇校验位，校验位为1，
 * 所以校验后的二进制数为10110011，字母同理。
 * @author: matilda
 * @create: 2020-07-05 15:35
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            for (int i = 0; i < s.length(); i++) {
                int ch = s.charAt(i);
                if (c(ch) % 2 == 0){//若1的个数为偶数
                    ch += 128;
                }
                System.out.println(num(ch));
            }
        }
    }

    //整数换为二进制输出
    private static String num(int n) {
        int b = 128;
        StringBuffer string = new StringBuffer();
        for (int i = 0; i < 8; i++) {
            if ((n & b) == b){
                string.append("1");
            }else {
                string.append("0");
            }
            b = (b>>>1);
        }
        return string.toString();
    }

    //判断二进制中1的个数
    private static int c(int n) {
        int count = 0;
        int b = 1;
        for (int i = 0; i < 8; i++) {
            if ((n & b) == b){
                count++;
            }
            b = (b<<1);
        }
        return count;
    }
}
