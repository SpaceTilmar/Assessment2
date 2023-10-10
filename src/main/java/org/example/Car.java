package org.example;

public class Car extends Vehicle implements Driveable{
    private int numberOfDoors;
    private float extraTax = .05F;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public float getExtraTax() {
        return extraTax;
    }

    public void setExtraTax(float extraTax) {
        this.extraTax = extraTax;
    }

    public Car(String name) {
        super(name);
    }

    public Car(String name, int speed, float price, Size engine) {
        super(name, speed, price, engine);
    }
    public void printNumberOfDoors(){
        System.out.println(numberOfDoors);
    }
    @Override
    public void printSpeed() {
        System.out.println(getSpeed());
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", extraTax=" + extraTax +
                ", TAX_AMT=" + TAX_AMT +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
