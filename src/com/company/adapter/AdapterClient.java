package com.company.adapter;

public class AdapterClient {
    public void test() {
        ICar privateCar = new PrivateCar();
        ISpeedAdapter speedAdapter = new SpeedAdapter(privateCar);
        double speedInKilo = speedAdapter.getSpeedPerHour("kilo");
        System.out.println("speed per hour in kilo: " + speedInKilo);
    }
}
