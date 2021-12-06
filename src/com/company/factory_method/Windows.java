package com.company.factory_method;

public class Windows implements OperatingSystem {
    @Override
    public void print() {
        System.out.println("Windows is not free!");
    }
}
