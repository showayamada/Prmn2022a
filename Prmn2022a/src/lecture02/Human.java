package lecture02;

public class Human {
    String name = "たかし";
    int age = 18;
    public void print() {
        if (age <= 18) {
            System.out.println("生徒:" + name + " " + age + "歳です。");
        } else if (age <= 22 && age > 18) {
            System.out.println("学生：" + name + " " + age + "歳です。");
        }
    }
}
