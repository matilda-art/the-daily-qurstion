import java.util.Scanner;

/**
 * @program: 字符串加解密
 * @description
 * 1、对输入的字符串进行加解密，并输出。
 * 2、加密方法为：
 * 当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
 * 当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
 * 其他字符不做变化
 * 3、解密方法为加密的逆过程。
 *
 *
 * 接口描述：
 *     实现接口，每个接口实现1个基本操作：
 * void Encrypt (char aucPassword[], char aucResult[])：在该函数中实现字符串加密并输出
 * 说明：
 * 1、字符串以\0结尾。
 * 2、字符串最长100个字符。
 *
 * int unEncrypt (char result[], char password[])：在该函数中实现字符串解密并输出
 * 说明：
 * 1、字符串以\0结尾。
 * 2、字符串最长100个字符。
 * @author: matilda
 * @create: 2020-07-17 21:38
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String s1 = sc.nextLine();//需要加密
            String s2 = sc.nextLine();//需要解密

            StringBuffer sb1 = new StringBuffer("");
            StringBuffer sb2 = new StringBuffer("");
            //加密过程
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                if (ch >= 'a' && ch < 'z')
                    sb1.append(Character.toString((char)(ch-31)));
                else if (ch == 'z')
                    sb1.append("A");
                else if (ch >= 'A' && ch < 'Z')
                    sb1.append(Character.toString((char)(ch+33)));
                else if (ch == 'Z')
                    sb1.append("a");
                else if (ch >= '0' && ch < '9')
                    sb1.append(Character.toString((char)(ch+1)));
                else if (ch == '9')
                    sb1.append("0");
                else
                    sb1.append(Character.toString(ch));
            }
            System.out.println(sb1.toString());

            //解密过程
            for (int i = 0; i < s2.length(); i++) {
                char ch = s2.charAt(i);
                if (ch > 'a' && ch <= 'z')
                    sb2.append(Character.toString((char)(ch-33)));
                else if (ch == 'a')
                    sb2.append("Z");
                else if (ch > 'A' && ch <= 'Z')
                    sb2.append(Character.toString((char)(ch+31)));
                else if (ch == 'A')
                    sb2.append("z");
                else if (ch > '0' && ch <= '9')
                    sb2.append(Character.toString((char)(ch-1)));
                else if (ch == '0')
                    sb2.append("9");
                else
                    sb2.append(Character.toString(ch));
            }
            System.out.println(sb2.toString());
        }
    }
}
