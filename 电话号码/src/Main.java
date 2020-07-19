import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @program: 电话号码
 * @description
 * 一个电话的九宫格，如你所见一个数字对应一些字母，因此在国外企业喜欢把电话号码设计成与自己公司名字相对应。
 * 例如公司的Help Desk号码是4357，因为4对应H、3对应E、5对应L、7对应P，因此4357就是HELP。同理，TUT-GLOP就代表888-4567、310-GINO代表310-4466。
 * NowCoder刚进入外企，并不习惯这样的命名方式，现在给你一串电话号码列表，请你帮他转换成数字形式的号码，并去除重复的部分。
 * @author: matilda
 * @create: 2020-07-19 20:14
 **/

public class Main {
    public static void main(String[] args) {
        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "222333444555666777788899991234567890";
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            ArrayList<String> arrayList = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                String str = scanner.next();
                str = str.replace("-","");
                String result = "";
                for (int j = 0; j < 7; j++) {
                    result += number.charAt(symbol.indexOf(str.charAt(j)+""));
                }
                result = result.substring(0,3) + "-" + result.substring(3,7);
                if (!arrayList.contains(result))
                    arrayList.add(result);
            }
            Collections.sort(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
            System.out.println();
        }
    }
}
