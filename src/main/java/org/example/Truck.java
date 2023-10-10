package org.example;

public class Truck extends Vehicle implements Driveable{
    public Truck(String name) {
        super(name);
    }

    public Truck(String name, int speed, float price, Size engine) {
        super(name, speed, price, engine);
    }
    @Override
    public void printSpeed() {
        System.out.println(getSpeed());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "TAX_AMT=" + TAX_AMT +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
