package lecture02;

public class Car2 {
        int fuel;
        Engine engine;
        Tire[] tires;
        Car2(Tire[] tires, Engine engine) {
            this.fuel = 0;
            //for文で入れる
            for (int i = 0; i <= tires.length; i++ ) {
                this.tires[i] = tires[i];
            }
            this.engine = engine;
        }

            public void run () {
                if (fuel <= 0) {
                    System.out.println("燃料が足りないため走れませんでした。");
                } else {
                    fuel--;
                    System.out.println("燃料を1消費して走りました。");
                }
            }

            public void startEngine () {
                Engine e = new Engine(engine.rpm);
                e.start();
            }
}
