package suu.assignment;
 
import java.util.*;
 
public class CarDealer {
 
    ArrayList<Car> cars = new ArrayList<Car>();
    private final String name = "Richardandco";
 
    public CarDealer() {
    }
 
    public void addCar(Car a) {
        cars.add(a);
    }
 
    public void printCars() {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).toString();
        }
    }
 
    public int numberOfCars() {
        return cars.size();
    }
 
    public int getTotalValue() {
        int totalPrice = 0;
        for (int i = 0; i < cars.size(); i++) {
            totalPrice += cars.get(i).getPrice();
        }
        return totalPrice;
    }
 
    public int getPriceOfCar(int i) {
        int priceOfCar = 0;
        return priceOfCar = cars.get(i).getPrice();
    }
 
    public void increaseAllPrices(double percent) {
        percent = percent / 100;
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).setPrice((int) percent + (int) cars.get(i).getPrice());
        }
 
    }
 
    public Car getMostExpensiveCar() {
        Car mostexpensive = null;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() > mostexpensive.getPrice()) {
                mostexpensive = cars.get(i);
            }
        }
        return mostexpensive;
    }
 
    public int searchCarWithCode(String code) {
        for (int i = 0; i < cars.size(); i++) {
            if (code.equals(cars.get(i).getCode())) {
                return cars.get(i).getPrice();
            }
        }
        return 0;
    }
 
    public Car searchSpecificCar(Car car) {
        if (cars.size() > 0) {
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).equals(car)) {
                    return cars.get(i);
                }
            }
 
        }
        return null;
    }
 
 
 
public ArrayList<Car> carsInRange(int min, int max) {
        ArrayList<Car> carsinrange = new ArrayList<Car>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() > min && cars.get(i).getPrice() < max) {
                carsinrange.add(cars.get(i));
            }
        }
        return carsinrange;
    }
 
}