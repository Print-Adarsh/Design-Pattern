package org.example.Dp.Strategy;

public class GoogleMaps {
    public void findPath(String from, String to, String mode){
        PathCalculatorStrategy pathCalculatorStrategy=
                PathCalculatorFactory.getPathCalculatorForMode(mode);
        pathCalculatorStrategy.findPath(from, to);
    }
}
