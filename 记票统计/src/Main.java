import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: 记票统计
 * @description
 *
 * 输入描述：
 * 输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。
 * 输出描述:
 * 每行输出候选人的名字和得票数量。
 *
 * @author: matilda
 * @create: 2020-06-30 17:42
 **/

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Map<String, Integer> map = new LinkedHashMap<String, Integer>();
            for(int i = 0; i < n; i++) {
                map.put(sc.next(),0);
            }
            int vote = sc.nextInt();
            int invalid = 0;
            for(int j = 0; j < vote; j++) {
                String temp = sc.next();
                if(map.get(temp) == null) {
                    invalid ++;
                } else {
                    map.put(temp,map.get(temp)+1);
                }
            }
            for(Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("Invalid : " + invalid);
        }
    }
}
