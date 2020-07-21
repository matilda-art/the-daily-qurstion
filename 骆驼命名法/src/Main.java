import java.util.Scanner;

/**
 * @program: 骆驼命名法
 * @description
 * 从C/C++转到Java的程序员，一开始最不习惯的就是变量命名方式的改变。
 * C语言风格试用下划线分隔多个单词，例如“hello_world”;而Java则采用一种叫骆驼命名法的规则;
 * 除首个单词以外，所有单词的首字母大写，例如“helloWorld”
 * 请你帮可怜的程序员们自动转换变量名
 * @author: matilda
 * @create: 2020-07-21 09:08
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] words = str.split("_");
            String result = words[0];
            for (int i = 1; i < words.length; i++) {
                result += (char)(words[i].charAt(0)-'a'+'A');//通过ASCII码将小写转为大写
                for (int j = 1; j < words[i].length(); j++) {
                    result += words[i].charAt(j);
                }
            }
            System.out.println(result);
        }
    }
}
