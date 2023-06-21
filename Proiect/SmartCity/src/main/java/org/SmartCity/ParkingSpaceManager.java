package org.SmartCity;

public class ParkingSpaceManager {
    private final ParkingSpace parkingSpace;

    public ParkingSpaceManager(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public void updateOccupancyStatus(int parkingLotIndex, boolean occupied, String registrationNumber) {
        if (parkingLotIndex >= 0 && parkingLotIndex < parkingSpace.getCapacity()) {
            ParkingLot parkingLot = parkingSpace.getParkingLots().get(parkingLotIndex);
            parkingLot.setOccupied(occupied);
            parkingLot.setRegistrationNumber(registrationNumber);
        }
    }

    public void generateReport() {
        int occupiedLotsCount = 0;
        for (ParkingLot parkingLot : parkingSpace.getParkingLots()) {
            if (parkingLot.isOccupied()) {
                occupiedLotsCount++;
            }
        }
        int freeLotsCount = parkingSpace.getCapacity() - occupiedLotsCount;
        System.out.println("Numarul total de locuri de parcare: " + parkingSpace.getCapacity());
        System.out.println("Locuri de parcare ocupate: " + occupiedLotsCount);
        System.out.println("Locuri de parcare libere: " + freeLotsCount);
    }
}
