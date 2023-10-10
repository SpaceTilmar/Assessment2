package org.example;

public class Boat extends Vehicle implements Driveable{
    private boolean hasGPS;

    public Boat(String name) {
        super(name);
    }

    public Boat(String name, int speed, float price, Size engine) {
        super(name, speed, price, engine);
    }


    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }
    public void printGpsInfo(){
        System.out.println(isHasGPS());
    }


    @Override
    public void printSpeed() {
        System.out.println(getSpeed());
    }
}
