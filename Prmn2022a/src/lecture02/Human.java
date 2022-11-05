package lecture02;

import java.util.StringTokenizer;

public class Human {
    String name;
    int age;

    Human(String str, int a){
        name = str;
        age = a;
    }
    public void print() {
        if (age <= 18) {
            System.out.println("生徒:" + name + " " + age + "歳です。");
        } else if (age <= 22 && age > 18) {
            System.out.println("学生：" + name + " " + age + "歳です。");
        }
    }
}
