import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: 数组中值出现了一次的数字
 * @description
 * 给定一个数字arr，其中只有有两个数字出现了奇数次，其他狮子都出现了偶数次，按照从小到大顺序输出这两个数
 * @author: matilda
 * @create: 2020-07-20 22:43
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] num = new int[n];
            int[] num1 = new int[2];
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (map.containsKey(num[j])){
                    map.put(num[j],map.get(num[j])+1);
                }else {
                    map.put(num[j],1);
                }
            }
            int k = 0;
            for (Integer key:map.keySet()) {
                if (map.get(key)%2 != 0){
                    num1[k] = key;
                    k++;
                }
            }
            Arrays.sort(num1);
            String a = "";
            a = num1[0] + " " + num1[1];
            System.out.println(a);
        }
    }
}
