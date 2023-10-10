package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    Vehicle boat = new Boat("Boat",60,50000,Size.SMALL);
    Vehicle car = new Car("Car",280,80000,Size.MEDIUM);
    Vehicle truck = new Truck("Truck",120,80000,Size.LARGE);
    Vehicle flyingCar = new FlyingCar("FlyingCar",1020,1000000,Size.LARGE);
    Vehicle plane = new Plane("Plane",2000,180000,Size.LARGE);
    Drone drone = new Drone("DroneX");

    List<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(boat);
    vehicles.add(car);
    vehicles.add(truck);
    vehicles.add(flyingCar);
    vehicles.add(plane);
    VehicleApp.printListOfVehicleNames(vehicles);

    List<Flyable> flyables = new ArrayList<>();
    flyables.add(drone);
    flyables.add((Flyable) plane);
    flyables.add((Flyable) flyingCar);
    VehicleApp.printListOfFlyableObjects(flyables);


    Passenger.info.put(57,"Wesley Snipes");
    Passenger.info.put(007,"James Bond");

    }
}