package org.example.Dp.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Bike Path" + fromLocation + " to " + toLocation);
    }
}
