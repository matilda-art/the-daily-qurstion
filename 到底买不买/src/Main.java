import java.util.*;

/**
 * @program: 到底买不买
 * @description
 * 小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多五颜六色的珠串，但是不肯把任何一串拆散了卖。
 * 于是小红要你帮忙判断一下，某传珠子里是否包含了全部自己想要的珠子？
 * 如果是，那么告诉她有多少多余的珠子；如果不是，那么告诉她缺了多少珠子。
 *
 * 为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色。
 * 例如：
 * YrR8RrY是小红想做的珠串；那么ppRYYGrrYBR2258可以买，因为包含了全部她想要的珠子，还多了8颗不需要的珠子；
 * ppRYYGrrYB225不能买，因为没有黑色珠子，并且少了一颗红色的珠子。
 *
 * 输出描述：
 * 如果可以买，则在一行中输出“Yes”以及有多少多余的珠子；如果不可以买，则在一行中输出“No”以及缺了多少珠子。
 * 其间以1个空格分隔。
 * @author: matilda
 * @create: 2020-06-25 20:59
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.next();//摊主所拥有的
            String str2 = scanner.next();//需要的
            LinkedList<Character> list = new LinkedList<>();
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                list.add(ch);
            }

            int count = 0;
            for (int i = 0; i < str2.length(); i++) {
                char ch = str2.charAt(i);
                for (int j = 0; j < list.size(); j++) {
                    if (ch == list.get(j)) {
                        list.remove(j);
                        count++;
                        break;
                    }
                }
            }

            if (count == str2.length()) {
                System.out.println("Yes " + (str1.length() - count));
            } else {
                System.out.println("No " + (str2.length() - count));
            }
        }
    }
}