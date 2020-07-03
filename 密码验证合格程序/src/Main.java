import java.util.Scanner;

/**
 * @program: 密码验证合格程序
 * @description
 * 密码要求：
 * 1.长度超过8位
 * 2.包括大小写字母，数字，其它符号，以上四种至少三种
 * 3.不能有相同长度超过2的子串重复
 *
 * 输出描述：
 * 如果符合要求输出：OK，否则输出NG
 * @author: matilda
 * @create: 2020-07-03 09:35
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            if (JudgeLength(str) && JudgeRepeat(str) && JudgeKinds(str)){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }

    //长度判断
    public static boolean JudgeLength(String str){
        if (str.length() > 8)
            return true;
        return false;
    }

    //判断不能有相同长度超过2的子串重复（>=3
    public static boolean JudgeRepeat(String str){
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i+1).contains(str.substring(i,i+3))){
                return false;
            }
        }
        return true;
    }

    //判断大小写字符，数组和其他符号，以上四种或者至少三种
    public static boolean JudgeKinds(String str){
        char[] Mychar = str.toCharArray();
        int a = 0, b = 0, c = 0, d = 0;
        for (Character x:Mychar) {
            if (x >= 'a' && x <= 'z'){
                a = 1;
            }else if (x >= 'A' && x <= 'Z'){
                b = 1;
            }else if (x >= '0' && x <= '9'){
                c = 1;
            }else {
                d = 1;
            }
            //循环只要满足三种字符类型以上就停止循环
            if ((a+b+c+d) >= 3){
                return true;
            }
        }
        return false;
    }
}
