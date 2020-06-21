import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: 成绩排序
 * @description
 * 查找和排序：
 * 输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排序
 * 相同成绩都按先录入排序在前的规则处理
 *
 * 输入描述：按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开
 * @author: matilda
 * @create: 2020-06-21 21:24
 **/
class Student{
    public String name;
    public int score;

    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();//输入人数
            int option = scanner.nextInt();//排序策略
            //输入人员的姓名和成绩
            List<Student> studentList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                studentList.add(new Student(scanner.next(), scanner.nextInt()));
            }
            if (option == 0) {//降序
                studentList.sort((o1, o2) -> o2.score - o1.score);
            } else if (option == 1) {//升序
                studentList.sort((o1, o2) -> o1.score - o2.score);
            }
            for (Student student : studentList) {
                System.out.println(student.name + " " + student.score);
            }
        }
    }
}
