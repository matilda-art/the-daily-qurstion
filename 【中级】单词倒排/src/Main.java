import java.util.Scanner;

/**
 * @program: 【中级】单词倒排
 * @description
 * 对字符串中的所有单词进行倒排。
 * 说明：
 * 1、每个单词是以26个大写或小写英文字母构成;
 * 2、非构成单词的字符均视为单词间隔符;
 * 3、要求倒排后的单词间隔符以一个空格表示;如果原字符串中相邻单词间有多个间隔符时，倒排转换后也允许出现一个空格间隔符;
 * 4、每个单词最长20个字母;
 * @author: matilda
 * @create: 2020-07-21 09:20
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String input = sc.nextLine();
            //将不是字母的都换成空格
            char[] charArray = input.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (!isAlphaBelta(charArray[i])) {
                    charArray[i] = ' ';
                }
            }
            //去掉两端的空格
            input = String.valueOf(charArray).trim();

            String[] split = input.split("\\s+");//实现多个空格的切割
            StringBuffer sb = new StringBuffer();
            int j;
            for (j = split.length-1; j > 0; j--) {
                sb.append(split[j]+" ");
            }
            sb.append(split[j]);
            System.out.println(sb.toString());
        }
    }

    //是否是字母
    private static boolean isAlphaBelta(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            return true;
        }
        return false;
    }
}
