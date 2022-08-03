package com.carsimulator;

public class FuelGauge {
    protected double fuelLevel;

    public FuelGauge() {
        fuelLevel = 0.0;
    }
    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public double getFuelLevel() {
        return fuelLevel;
    }
    public void incrementFuelLevel() {
        if (fuelLevel >= 15) {
            System.out.println("The Fuel Tank is full!!");
        } else
            fuelLevel += 1;
    }
    public void decrementFuelLevel() {
        double fraction = 1 + Math.random();
        if (fuelLevel <= 0) {
            System.out.println("The Fuel Tank is empty!!");
        } else
            fuelLevel -= fraction;
    }
}