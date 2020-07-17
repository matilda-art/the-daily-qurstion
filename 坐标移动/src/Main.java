import java.util.Scanner;

/**
 * @program: 坐标移动
 * @description\
 * 开发一个坐标计算工具，A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。
 * 从(0,0)点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 * 输入：
 * 合法坐标为A（或者D或者W或者S）+数字（两位以内）
 * 坐标之间以；分隔
 * 非法坐标点需要进行丢弃。如AA10;A1A;$%$;YAD；等
 * 下面是一个简单的例子，如：A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * 起点(0,0) + A10 = (-10,0) + S20 = (-10,-20) + W10 = (-10,-10) + D30 = (20,-10)
 * + X = 无效 + A1A = 无效 + B10A11 = 无效 + 一个空 不影响 + A10 = (10,-10)
 * @author: matilda
 * @create: 2020-07-17 14:51
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] A = str.split(";");
            int x = 0,y = 0;
            for (String s:A) {
                if (s.charAt(0) == 'D' && s.substring(1).matches("[0-9]+"))
                    x += Integer.parseInt(s.substring(1));
                if (s.charAt(0) == 'W' && s.substring(1).matches("[0-9]+"))
                    y += Integer.parseInt(s.substring(1));
                if (s.charAt(0) == 'S' && s.substring(1).matches("[0-9]+"))
                    y -= Integer.parseInt(s.substring(1));
                if (s.charAt(0) == 'A' && s.substring(1).matches("[0-9]+"))
                    x -= Integer.parseInt(s.substring(1));
            }
            System.out.println(x + "," + y);
        }
    }
}
