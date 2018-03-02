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
public abstract class Vehicle {

    private static int ID;
    protected int price;
    protected String code;
    protected String brand;
    protected String type;
    protected int yearOfConstruction;
    
     public Vehicle(String brand, String type, int yearOfConstruction, int price, String code) {
        this.brand = brand;
        this.type = type;
        this.yearOfConstruction = yearOfConstruction;
        this.price = price;
        this.code = code;
    }
 

    public String toString() {
        return  "ID" + this.ID + "Brand: " + this.brand + " Type: " + this.type + " Construction Year: " + this.yearOfConstruction + " Price: " + this.price ;
        
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;

    }

    public int getPrice() {
        return price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
     public boolean equals(Vehicle a) {
        if (this.brand.equals(a.brand) && this.type.equals(a.type) && this.yearOfConstruction == a.yearOfConstruction) {
            return true;
        } else {
            return false;
        }
 
    }

}
