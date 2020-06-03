import java.util.Scanner;

/**
 * @program: 字符串中找出连续最长的字符串
 * @description
 * 思路：
 * 用两个循环判断，一个判断是否为数字，第二个计算长度。
 * 最后将最长的从原字符中截取出来。
 * @author: matilda
 * @create: 2020-06-03 10:33
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ('0' <= arr[i] && '9' >= arr[i]){
                count = 1;
                int index = 0;//截取至索引
                for (int j = i+1; j < arr.length; j++) {
                    if ('0' <= arr[j] && '9' >= arr[j]){
                        count++;
                        index = j;
                    }else {
                        break;
                    }
                }
                if (count > result.length()){
                    result = str.substring(i,index+1);
                }
            }else {
                continue;
            }
        }
        System.out.println(result);
    }
}
