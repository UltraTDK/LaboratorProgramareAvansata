package org.SmartCity;

public class FeesHandler {
    private final double pricePerHour;

    public FeesHandler(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double calculateReservationPrice(int hours) {
        return pricePerHour * hours;
    }
}
