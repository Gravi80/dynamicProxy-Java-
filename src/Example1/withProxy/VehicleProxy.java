package Example1.withProxy;

import Example1.NoProxy.Vehicle;

public class VehicleProxy implements Vehicle {

    private Vehicle v;

    public VehicleProxy(Vehicle v) {
        this.v = v;
    }

    @Override
    public void start() {
        System.out.println("VehicleProxy: Begin of start()");
        v.start();
        System.out.println("VehicleProxy: End of start()");
    }

    @Override
    public void stop() {
        System.out.println("VehicleProxy: Begin of stop()");
        v.stop();
        System.out.println("VehicleProxy: End of stop()");
    }

    @Override
    public void forward() {
        System.out.println("VehicleProxy: Begin of forward()");
        v.forward();
        System.out.println("VehicleProxy: End of forward()");
    }

    @Override
    public void reverse() {
        System.out.println("VehicleProxy: Begin of reverse()");
        v.reverse();
        System.out.println("VehicleProxy: End of reverse()");
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException();
    }
}
