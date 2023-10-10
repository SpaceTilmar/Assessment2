package org.example;

public abstract class Vehicle extends Product{
    public Vehicle(String name) {
        super(name);
    }
    private int speed;
    private float price;
    private Size engine;
    protected final float TAX_AMT = .10F;
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Size getEngine() {
        return engine;
    }

    public void setEngine(Size engine) {
        this.engine = engine;
    }

    public Vehicle(String name, int speed, float price, Size engine) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }

    public void printVehicleType(){
        System.out.println(getClass());
    }
    public float getPriceAfterTax(Vehicle vehicle){
        float calculatePrice = price * TAX_AMT;
        price = calculatePrice + price;
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", price=" + price +
                ", engine=" + engine +
                ", TAX_AMT=" + TAX_AMT +
                ", name='" + getName() + '\'' +
                '}';
    }
}
