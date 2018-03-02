/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suu.assignment;

/**
 *
 * @author Marc
 */
public abstract class MotorizedVehicle extends Vehicle {

    protected String motorBrand;
    protected int PS;
    
     public MotorizedVehicle(String brand, String type, int yearOfConstruction, int price, String code, String motorbrand, int PS) {
        super (brand,type,yearOfConstruction,price,code);
        this.motorBrand = motorbrand;
        this.PS = PS;
    }
 

    @Override
    public String toString() {
       String tmp = super.toString() + "Motorbrand: " + this.motorBrand +" PS: " + this.PS;
        return tmp;
    }

    public String getMotorBrand() {
        return motorBrand;
    }

    public void setMotorBrand(String motorBrand) {
        this.motorBrand = motorBrand;
    }

    public int getPS() {
        return PS;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }
}
