package org.SmartCity;

class ParkingLot {
    private final int lotNumber;
    private boolean occupied;
    private String registrationNumber;

    private static int nextLotNumber = 1;

    public ParkingLot() {
        this.lotNumber = nextLotNumber++;
        this.occupied = false;
        this.registrationNumber = "";
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
