package com.carsimulator;

public class Odometer {
    public static final int MAX_MILEAGE = 999999;
    int mileage;
    int mpgTracker;
    public Odometer() {
        mileage = 0;
        mpgTracker = 24;    //since mpg is 24.
    }

    //Methods
    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    //Increments mileage by 1 and resets to 0 if it exceeds limit.
    public void incrementMileage() {
        if (mileage >= MAX_MILEAGE) {
            this.mileage = 0;
        } else
            mileage += 1;
    }

    //Decrements the FuelGauge fuel levels by 1 if the conditions are met.
    public void decrementFuelLevel(FuelGauge obj) {
        double fuel = obj.getFuelLevel();
        obj.decrementFuelLevel();
        if (mileage >= mpgTracker) {
            fuel -= 1;
            obj.setFuelLevel(fuel);
            mpgTracker += 24;
        }
    }
}
