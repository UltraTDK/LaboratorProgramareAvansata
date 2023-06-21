package org.SmartCity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ParkingSpaceController {

    @RequestMapping("/smartcity")
    public List<String> displayData() {
        List<String> data = new ArrayList<>();

        ParkingSpace parkingSpace = new ParkingSpace(15);
        ParkingSpaceManager manager = new ParkingSpaceManager(parkingSpace);
        SmartAssistant assistant = new SmartAssistant();
        FeesHandler feesHandler = new FeesHandler(5);

        // atribuirea unui vehicul intr-un loc de parcare
        manager.updateOccupancyStatus(4, true, "IS-01-AAA");
        // generarea unui raport informativ
        manager.generateReport();

        // verificarea locurilor de parcare
        assistant.checkAvailability(parkingSpace);

        Vehicle vehicle = new Vehicle("IS-02-BBB");
        assistant.assignParkingLot(parkingSpace, vehicle);

        // calcul pt pretul unei rezervari
        double reservationPrice = feesHandler.calculateReservationPrice(2);
        data.add("Reservation price: " + reservationPrice);

        // verificare daca asistentul trimite notificari
        assistant.sendNotification("Loc de parcare liber.");

        // Test for the modified ParkingSpace and ParkingLot classes
        System.out.println("Numarul locurilor de parcare initiale: " + parkingSpace.getCapacity());
        System.out.println("Locurile de parcare initiale:");
        for (ParkingLot parkingLot : parkingSpace.getParkingLots()) {
            data.add("Locul de parcare " + parkingLot.getLotNumber() + ": Ocupat: " + parkingLot.isOccupied());
        }

        // cresterea capacitatii
        parkingSpace.setCapacity(12);

        data.add("Numarul locurilor de parcare dupa crestere: " + parkingSpace.getCapacity());
        data.add("Locurile de parcare dupa crestere:");
        for (ParkingLot parkingLot : parkingSpace.getParkingLots()) {
            data.add("Locul de parcare " + parkingLot.getLotNumber() + ": Ocupat: " + parkingLot.isOccupied());
        }

        // scaderea capacitatii
        parkingSpace.setCapacity(8);

        data.add("Numarul locurilor de parcare dupa scadere: " + parkingSpace.getCapacity());
        data.add("Locurile de parcare dupa scadere:");
        for (ParkingLot parkingLot : parkingSpace.getParkingLots()) {
            data.add("Locul de parcare " + parkingLot.getLotNumber() + ": Ocupat: " + parkingLot.isOccupied());
        }

        return data;
    }
}
