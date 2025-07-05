package org.example.Dp.Strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Walking path from " + fromLocation + " to " + toLocation);
    }
}
