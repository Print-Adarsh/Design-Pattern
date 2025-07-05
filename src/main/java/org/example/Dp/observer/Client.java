package org.example.Dp.observer;

public class Client {
    public static void main(String[] args) {
        FlipKart flipKart= FlipKart.getInstance();
        EmailService emailService = new EmailService();
        InventoryService inventoryService = new InventoryService();
        InvoiceGeneration invoiceGeneration = new InvoiceGeneration();
        flipKart.onOrderPlaced();
        flipKart.removeOnOrderPlacedSubscriber(invoiceGeneration);
        flipKart.addOnOrderPlacedSubscriber(invoiceGeneration);
        flipKart.onOrderPlaced();
    }
}
