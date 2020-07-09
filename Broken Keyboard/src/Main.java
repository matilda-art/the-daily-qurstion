import java.util.HashSet;
import java.util.Scanner;

/**
 * @program: Broken Keyboard
 * @description
 * 坏键盘问题
 * @author: matilda
 * @create: 2020-07-09 17:32
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expected = scanner.nextLine();
        String actual = scanner.nextLine();

        //把实际的字符转换为大写存放到集合当中
        HashSet<Character> setActual = new HashSet<>();
        for (char s:actual.toUpperCase().toCharArray()) {
            setActual.add(s);
        }

        HashSet<Character> setBroken = new HashSet<>();
        for (char t:expected.toUpperCase().toCharArray()) {
            if (!setActual.contains(t) && !setBroken.contains(t)) {
                System.out.print(t);
                setBroken.add(t);
            }
        }
    }
}