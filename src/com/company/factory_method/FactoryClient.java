package com.company.factory_method;

import java.util.Scanner;

public class FactoryClient {
    public void test() {
        System.out.println("Type free / any other string");
        Scanner sc = new Scanner(System.in);
        String osType = sc.nextLine();

        OperatingSystem operatingSystem =  OSFactory.getOperatingSystem(osType);
        operatingSystem.print();
    }
}
