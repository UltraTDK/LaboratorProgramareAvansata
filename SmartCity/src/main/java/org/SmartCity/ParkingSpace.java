package org.SmartCity;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpace {
    private int capacity;
    private final List<ParkingLot> parkingLots;

    public ParkingSpace(int capacity) {
        this.capacity = capacity;
        this.parkingLots = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            parkingLots.add(new ParkingLot());
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= this.capacity) {
            int additionalSpaces = capacity - this.capacity;
            for (int i = 0; i < additionalSpaces; i++) {
                parkingLots.add(new ParkingLot());
            }
        } else {
            int removalCount = this.capacity - capacity;
            for (int i = 0; i < removalCount; i++) {
                parkingLots.remove(parkingLots.size() - 1);
            }
        }
        this.capacity = capacity;
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }
}
