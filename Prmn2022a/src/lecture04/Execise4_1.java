package lecture04;

public class Execise4_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(100, 40,"a");
        Fighter fighter2 = new Fighter(100, 20, "b");

        while (fighter1.isAlive() || fighter2.isAlive()) {
            fighter1.attack(fighter2);
            fighter2.setHitPoint();
            fighter2.attack(fighter1);
            fighter1.setHitPoint();
        }
        if (fighter1.isAlive()) {
            System.out.println(fighter1.getName() + "は倒れた。");
        }else {
            System.out.println(fighter2.getName() + "は倒れた。");
        }
    }
}
