package Example1.withProxy;

import Example1.NoProxy.Car;
import Example1.NoProxy.Vehicle;

public class Client2 {
    public static void main(String[] args) {
        Vehicle c = new Car("Botar");
        Vehicle v = new VehicleProxy(c);
        v.start();
        v.forward();
        v.stop();
    }
}
