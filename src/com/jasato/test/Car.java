package com.jasato.test;

public class Car {

    private  String brand;
    private String model;

    public Car(String brand, String model) {
        setBrand(brand);
        setModel(model);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getYear(String brand) {
        return 1945;
    }
}
