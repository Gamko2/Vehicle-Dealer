package suu.assignment;

public class Car extends MotorizedVehicle {

    protected String carOwner;

    public Car(String brand, String type, int yearOfConstruction, int price, String code, String motorbrand, int PS, String carOwner) {
        super(brand, type, yearOfConstruction, price, code, motorbrand, PS);
        this.carOwner = carOwner;
    }

    @Override
    public String toString() {
        String car = "Brand: " + this.brand + " Type: " + this.type + " Construction Year: " + this.yearOfConstruction + " Price: " + this.price
                + "Motorbrand: " + this.motorBrand + "PS: " + this.PS + "Owner: " + this.carOwner + "\n";
        return car;
    }

}
