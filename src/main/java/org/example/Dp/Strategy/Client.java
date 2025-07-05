package org.example.Dp.Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps= new GoogleMaps();
        googleMaps.findPath("Delhi" , "Ranchi" ,"Car");
    }


}
