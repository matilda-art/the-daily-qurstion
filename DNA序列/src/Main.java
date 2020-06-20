import java.util.Scanner;

/**
 * @program: DNA序列
 * @description
 * 一个DNA序列由A/C/G/T四个字母的排列组合组成。
 * G和C的比例（定义为GC-Ratio）是序列中G和C两个字母的总的出现次数除以总的字母数目（也就是序列长度）
 * 在基因工程中，这个比例非常重要。因为高的GC-Ratio可能是基因的起始点。
 *
 * 给定一个很长的DNA序列，以及要求的最小子序列长度。
 * 研究人员经常会需要在其中找出GC-Ratio最高的子序列。
 *
 * 输入描述：输入一个string型基因序列，和int型子串的长度
 * @author: matilda
 * @create: 2020-06-19 21:09
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            int n = sc.nextInt();

            int max = 0;
            int index = 0;//最高子序列的起始位置
            for (int i = 0; i <= str.length() - n; i++) {
                String sub = str.substring(i, i + n);
                int count = 0;
                //统计子串中的G/C数量
                for (Character ch : sub.toCharArray()) {
                    if (ch == 'G' || ch == 'C') {
                        count++;
                    }
                }
                //若G/C的数量大，则记录此时子串的开始位置
                if (count > max) {
                    index = i;
                    max = count;
                }
            }
            System.out.println(str.substring(index, index + n));
        }
    }
}
