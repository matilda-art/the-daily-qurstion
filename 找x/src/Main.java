import java.util.Scanner;

/**
 * @program: 找x
 * @description
 * 输入一个数n，然后输入n个数值各不相同，再输入一个值x，输出这个值再这个数值中的下标
 * （从0开始，若不在数组中则输出-1）
 *
 * 输入描述：
 * 输入n，接着输入n个数，然后输入x
 * @author: matilda
 * @create: 2020-07-02 16:42
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int x = scanner.nextInt();
            int index = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == x){
                    index = i;
                }
            }
            System.out.println(index);
        }
    }
}
