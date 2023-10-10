package org.example;

public class Plane extends Vehicle implements Flyable{
    public Plane(String name) {
        super(name);
    }

    public Plane(String name, int speed, float price, Size engine) {
        super(name, speed, price, engine);
    }

    @Override
    public boolean transportsPassengers() {
        return true;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "TAX_AMT=" + TAX_AMT +
                ", transportsPassengers=" + transportsPassengers() +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
