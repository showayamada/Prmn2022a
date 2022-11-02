package lecture02;

public class Exericise2_2 {
    public static void main(String[] argc){
        GasStation gas = new GasStation();
        Car car = new Car();
        car.run();
        gas.refuel(car);
        car.run();
    }
}
