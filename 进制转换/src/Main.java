import java.util.Scanner;

/**
 * @program: 进制转换
 * @description
 * 十六进制数转换为十进制数
 * @author: matilda
 * @create: 2020-07-12 20:07
 **/

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            System.out.println(Integer.decode(str));
        }
    }
}
