package org.example.Dp.observer;

import java.util.ArrayList;
import java.util.List;

public class FlipKart {
    public static FlipKart instance = null;
     private List<OnOrderPlacedSubscriber> onOrderPlacedSubscriberList= new ArrayList<>();

     // constructor
    private FlipKart() {}
    public static FlipKart getInstance() {
        if (instance == null) {
            instance = new FlipKart();
        }
        return instance;
    }
    // add subscriber
    void addOnOrderPlacedSubscriber(OnOrderPlacedSubscriber subscriber) {
        onOrderPlacedSubscriberList.add(subscriber);
    }
    // remove subscriber
     void removeOnOrderPlacedSubscriber(OnOrderPlacedSubscriber subscriber) {
        onOrderPlacedSubscriberList.remove(subscriber);
     }

     public void onOrderPlaced(){
         for (OnOrderPlacedSubscriber onOrderPlacedSubscriber : onOrderPlacedSubscriberList) {
             onOrderPlacedSubscriber.announcedOrderPlaced();
         }
     }


}
