package Example1.NoProxy;

public class Car implements Vehicle {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void start() {
       System.out.println("Car " + name + " started");
    }

    @Override
    public void stop() {
        System.out.println("Car " + name + " stop");
    }

    @Override
    public void forward() {
        System.out.println("Car " + name + " forward");
    }

    @Override
    public void reverse() {
        System.out.println("Car " + name + " reverse");
    }

    @Override
    public String getName () {
       throw new  UnsupportedOperationException();
    }

}
