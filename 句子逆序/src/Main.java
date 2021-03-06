import java.util.Scanner;

/**
 * @program: 句子逆序
 * @description
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * @author: matilda
 * @create: 2020-07-16 23:11
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            int len = str.length();
            String[] s = str.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int i = s.length-1; i >= 0; i--) {
                sb.append(s[i] + " ");
            }
            System.out.println(sb.substring(0,len));
        }
    }
}
