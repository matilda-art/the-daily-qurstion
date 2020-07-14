/**
 * @program: 空格替换
 * @description
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。
 * 假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
 *
 * 给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
 * @author: matilda
 * @create: 2020-07-14 15:16
 **/

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        if (iniString == null || iniString.length() <= 0)
            return iniString;

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char c = iniString.charAt(i);
            if (c == ' ')
                sb.append("%20");
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
