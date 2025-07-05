package org.example.Dp.observer;

public class InventoryService implements OnOrderPlacedSubscriber{
    @Override
    public void announcedOrderPlaced() {
        System.out.println("Notify InventoryService");
    }
}
