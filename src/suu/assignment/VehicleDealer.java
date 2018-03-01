/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suu.assignment;

import java.util.ArrayList;

/**
 *
 * @author Marc
 */
public class VehicleDealer {
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    private final String name = "Richardandco";
 
    
 
    public void addVehicle(Vehicle a) {
        vehicles.add(a);
    }
 
    public void printVehicles() {
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).toString();
        }
    }
 
    public int numberOfVehicles() {
        return vehicles.size();
    }
 
    public int getTotalValue() {
        int totalPrice = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            totalPrice += vehicles.get(i).getPrice();
        }
        return totalPrice;
    }
 
    public int getPriceOfVehicle(int i) {
        int priceOfCar = 0;
        return priceOfCar = vehicles.get(i).getPrice();
    }
 
    public void increaseAllPrices(double percent) {
        percent = percent / 100;
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).setPrice((int) percent + (int) vehicles.get(i).getPrice());
        }
 
    }
 
    public Vehicle getMostExpensiveVehicle() {
        Vehicle mostexpensive = null;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getPrice() > mostexpensive.getPrice()) {
                mostexpensive = vehicles.get(i);
            }
        }
        return mostexpensive;
    }
 
    public int searchCarWithCode(String code) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (code.equals(vehicles.get(i).getCode())) {
                return vehicles.get(i).getPrice();
            }
        }
        return 0;
    }
 
    public Vehicle searchSpecificVehicle(Vehicle vehicle) {
        if (vehicles.size() > 0) {
            for (int i = 0; i < vehicles.size(); i++) {
                if (vehicles.get(i).equals(vehicle)) {
                    return vehicles.get(i);
                }
            }
 
        }
        return null;
    }
 
 
 
public ArrayList<Vehicle> vehiclesInRange(int min, int max) {
        ArrayList<Vehicle> vehiclesinrange = new ArrayList<Vehicle>();
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getPrice() > min && vehicles.get(i).getPrice() < max) {
                vehiclesinrange.add(vehicles.get(i));
            }
        }
        return vehiclesinrange;
    }
 
}
