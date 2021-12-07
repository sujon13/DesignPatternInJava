package com.company.adapter;

public class SpeedAdapter implements ISpeedAdapter {
    private ICar car;

    public SpeedAdapter(ICar car) {
        this.car = car;
    }

    @Override
    public double getSpeedPerHour(String unit) {
        double speedInMile = this.car.getSpeedInMile();
        switch(unit) {
            case "kilo":
                return speedInMile * 1.61;

            default:
                return speedInMile;
        }
    }
}
