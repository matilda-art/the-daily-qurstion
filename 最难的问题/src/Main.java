import java.util.Scanner;

/**
 * @program: 最难的问题
 * @description
 * 破译密码。
 * 消息加密的方法是：对消息原文中的每个字母，分别用该字母之后的第五个字母替换
 * （例如：消息原文中的每个字母A都分别替换成字母F）
 * 其他字符不变，并且消息原文中的所有字母都是大写的。
 * 密码中的字母与原文中的字母对应关系如下。
 * 密码字母：A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 * 原文字母：V W X Y Z A B C D E F G H I J K L M N O P Q R S T U
 *
 * 输入描述：
 * 输入包含多组数据，每组数据一行，为收到的密文
 * 密文仅有空格和大写字母组成
 * @author: matilda
 * @create: 2020-06-25 19:59
 **/

//密码字母：A B C D E   F G H I J K L M N O P Q R S T U V W X Y Z
//原文字母：V W X Y Z   A B C D E F G H I J K L M N O P Q R S T U
//比如: F -> A  => F - 5
//比如：B -> W  => B + 21

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            char[] ch = str.toCharArray();//将字符串转为数组
            for (int i = 0; i < ch.length; i++) {
                char c = ch[i];
                if ('A' <= c) {
                    c = (char) ('E' < c ? (c - 5) : (c + 21));//根据ASCII码值
                    ch[i] = c;
                }
            }
            System.out.println(new String(ch));
        }
    }
}
