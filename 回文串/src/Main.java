import java.util.Scanner;

/**
 * @program: 回文串
 * @description
 * 给定一个字符串，问是否能通过添加一个字母将其变为回文串。
 * @author: matilda
 * @create: 2020-07-15 20:38
 **/

public class Main{
    public static void main(String as[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.next();
            System.out.println(getAns(s.toCharArray(),0,s.length()-1,false)?"YES":"NO");
        }
    }
    private static boolean getAns(char[] a,int start,int end,boolean flag){
        if(end <= start){
            return true;
        }
        if(a[start] == a[end]){
            return getAns(a,start+1,end-1,flag);
        }
        else{
            if(flag){
                return false;
            }
            return getAns(a,start,end-1,true)||getAns(a,start+1,end,true);
        }
    }
}

