package lecture02;

public class GasStation {
    public void refuel(Car car){
        car.fuel = car.fuel + 20;
        System.out.println("給油したことによりfuelが20増えました");
    }
    public void refuel(Car2 car){
        car.fuel = car.fuel + 20;
        System.out.println("給油したことによりfuelが20増えました");
    }
}
