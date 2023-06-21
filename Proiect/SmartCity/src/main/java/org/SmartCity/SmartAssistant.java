package org.SmartCity;

public class SmartAssistant {
    public void checkAvailability(ParkingSpace parkingSpace) {
        int freeLotsCount = 0;
        for (ParkingLot parkingLot : parkingSpace.getParkingLots()) {
            if (!parkingLot.isOccupied()) {
                freeLotsCount++;
            }
        }
        System.out.println("Locuri de parcare libere: " + freeLotsCount);
    }

    public void assignParkingLot(ParkingSpace parkingSpace, Vehicle vehicle) {
        for (ParkingLot parkingLot : parkingSpace.getParkingLots()) {
            if (!parkingLot.isOccupied()) {
                parkingLot.setOccupied(true);
                parkingLot.setRegistrationNumber(vehicle.getRegistrationPlate());
                System.out.println("Locul de parcare este asociat vehiculului cu numarul: " + vehicle.getRegistrationPlate());
                return;
            }
        }
        System.out.println("Nu sunt locuri libere. Va rugam sa reveniti mai tarziu.");
    }

    public void sendNotification(String message) {
        System.out.println("[Asistent]: " + message);
    }
}
