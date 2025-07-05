package org.example.Dp.observer;

public class InvoiceGeneration implements OnOrderPlacedSubscriber{
    @Override
    public void announcedOrderPlaced() {
        System.out.println("Generating invoice");
    }
}
