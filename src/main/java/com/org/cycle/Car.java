package com.org.cycle;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Car {
    public Car() {
        System.out.println("Car's constructor...");
    }

    private String brand;

    public void setBrand(String brand) {
        System.out.println("setBrand...");
        this.brand = brand;
    }

    public void init() {
        System.out.println("init...");
    }

    public void destroy() {
        System.out.println("destroy...");
    }
}
