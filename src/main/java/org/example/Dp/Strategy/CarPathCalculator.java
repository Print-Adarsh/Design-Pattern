package org.example.Dp.Strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Finding path from " + fromLocation + " to " + toLocation);
    }
}
