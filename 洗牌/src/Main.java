import java.util.Scanner;

/**
 * @program: 洗牌
 * @description
 * 洗牌在生活中十分常见，现在需要写一个程序模拟洗牌的过程。
 * 现在需要洗2n张牌，从上到下依次是第1张，第2张，第3张一直到第2n张。
 * 首先，我们把这2n张牌分成两堆，左手拿着第1张到第n张（上半堆），右手拿着第n+1张到第2n张（下半堆）。接
 * 着就开始洗牌的过程，先放下右手的最后一张牌，再放下左手的最后一张牌，接着放下右手的倒数第二张牌，再放下左手的倒数第二张牌，直到最后放下左手的第一张牌。
 * 接着把牌合并起来就可以了。
 * 例如有6张牌，最开始牌的序列是1,2,3,4,5,6。首先分成两组，左手拿着1,2,3；右手拿着4,5,6。
 * 在洗牌过程中按顺序放下了6,3,5,2,4,1。把这六张牌再次合成一组牌之后，我们按照从上往下的顺序看这组牌，就变成了序列1,4,2,5,3,6。
 * 现在给出一个原始牌组，请输出这副牌洗牌k次之后从上往下的序列。
 *
 * 思路：暴力求解
 * 分成两个数组，分组迭代
 * @author: matilda
 * @create: 2020-06-18 09:22
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();//代表测试数据的组数

        for (int i = 0; i < T; i++) {
            //需要洗2*n张牌
            int n = scanner.nextInt();
            long[] a = new long[2*n];
            long[] temp = new long[2*n];
            int k = scanner.nextInt();//代表一个洗牌的次数

            for (int j = 0; j < 2*n; j++) {
                a[j] = scanner.nextLong();
            }
            long[] temp1 = new long[n];//上半堆
            long[] temp2 = new long[n];//下半堆

            while (k-- > 0){
                int p = 0,q = 0;

                //上半堆
                for (int x = 0; x < n; x++) {
                    temp1[x] = a[x];
                }
                //下半堆
                for (int y = 0; y < n; y++) {
                    temp2[y] = a[y+n];
                }

                while (p < 2*n && q < n){
                    temp[p] = temp1[q];
                    temp[++p] = temp2[q];
                    q++;
                    p++;
                }
                for (int j = 0; j < 2*n; j++) {
                    a[j] = temp[j];
                }
            }

            for (int p = 0; p < 2*n; p++) {
                System.out.print(a[p]);
                if (p != 2*n -1){
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
