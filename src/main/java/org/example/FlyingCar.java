package org.example;

public class FlyingCar extends Vehicle implements Driveable, Flyable{
    public FlyingCar(String name) {
        super(name);
    }

    public FlyingCar(String name, int speed, float price, Size engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printSpeed() {
        System.out.println(getSpeed());
    }

    @Override
    public boolean transportsPassengers() {
        return true;
    }

    @Override
    public String toString() {
        return "FlyingCar{" +
                "TAX_AMT=" + TAX_AMT +
                ", transportsPassengers=" + transportsPassengers() +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
