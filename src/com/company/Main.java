package com.company;

import com.company.adapter.AdapterClient;
import com.company.factory_method.FactoryClient;
import com.company.strategy.StrategyClient;


public class Main {

    public static void main(String[] args) {
        // change below line to call other Design pattern
        // new FactoryClient().test();
        // new AdapterClient().test();
        new StrategyClient().test();
    }
}




