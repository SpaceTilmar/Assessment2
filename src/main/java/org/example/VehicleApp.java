package org.example;

import java.util.List;
import java.util.Map;

public class VehicleApp {
    public static void printListOfVehicleNames(List<Vehicle> vehicleNames){
        for(Vehicle vehicle : vehicleNames){
            System.out.println(vehicle.getName());
        }
    }
    public static void printListOfFlyableObjects(List<Flyable> flyableObjects){
        for(Flyable flyable : flyableObjects) {
            System.out.println(flyable.toString());
        }
    }
    public static void sortAndPrintDriveableVehiclesBySpeed(List<Driveable> driveableSpeed){
        System.out.println(driveableSpeed);
    }
    public static void printPassengerNumbersOnly(Map<Integer,String> passengerNumbers){

    }
}
