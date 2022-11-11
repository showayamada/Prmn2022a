package lecture04;

public class Execise4_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(100, 40,"ゆうの");
        Fighter fighter2 = new Fighter(100, 20, "しょうわ");

        while (fighter1.isAlive() || fighter2.isAlive()) {
            if (fighter1.isAlive()) {
                fighter1.attack(fighter2);
            }else {
                System.out.println(fighter1.getName() + "は倒れた。");
                System.exit(0);
            }
            System.out.println(fighter2.getName() + "は残りHP:" +fighter2.getHitPoint());

            if (fighter2.isAlive()) {
                fighter2.attack(fighter1);
            } else {
                System.out.println(fighter2.getName() + "は倒れた。");
                System.exit(0);
            }
            System.out.println(fighter1.getName() + "は残りHP:" + fighter1.getHitPoint());
        }
    }
}
