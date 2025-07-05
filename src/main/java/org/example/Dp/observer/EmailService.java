package org.example.Dp.observer;

public class EmailService implements  OnOrderPlacedSubscriber{


    @Override
    public void announcedOrderPlaced() {
        System.out.println("Sending Email");

    }
}
