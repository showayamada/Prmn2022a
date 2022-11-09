package lecture02;

public class Execise2_3 {
    public static void main(String[] args){
        Tire[] tires = new Tire[4];
        new Tire(65);
        Engine engine = new Engine(4000);
        Car2 car = new Car2(tires,engine);
        GasStation gas = new GasStation();
        gas.refuel(car);
        car.startEngine();
        car.run();

    }
}
