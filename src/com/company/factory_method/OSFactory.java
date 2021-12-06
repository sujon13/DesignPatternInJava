package com.company.factory_method;

public class OSFactory {
    public static OperatingSystem getOperatingSystem(String type) {
        switch (type) {
            case "free":
                return new Android();
            default:
                return new Windows();
        }
    }
}
