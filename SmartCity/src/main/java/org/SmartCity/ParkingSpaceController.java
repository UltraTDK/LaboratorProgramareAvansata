package org.SmartCity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class ParkingSpaceController {
    @RequestMapping("/smartcity")
    @ResponseBody
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = Boolean.FALSE;

        while(exit == Boolean.FALSE) {
            System.out.println("Bine ai venit in aplicatia SmartCity.");
            System.out.println("1. Generarea unui raport al locurilor de parcare libere.");
            System.out.println("2. Exit.");
            System.out.println("(Alege una dintre optiuni:)");
            String getOrSet = scanner.nextLine();
            if ("1".equalsIgnoreCase(getOrSet)) {
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

                // calcul pt pretul unei rezervaro
                double reservationPrice = feesHandler.calculateReservationPrice(2);
                System.out.println("Reservation price: " + reservationPrice);

                // verificare daca asistentul trimite notificari
                assistant.sendNotification("Loc de parcare liber.");

                // Test for the modified ParkingSpace and ParkingLot classes
                System.out.println("Numarul locurilor de parcare initiale: " + parkingSpace.getCapacity());
                System.out.println("Locurile de parcare initiale:");
                for (ParkingLot parkingLot : parkingSpace.getParkingLots()) {
                    System.out.println("Locul de parcare " + parkingLot.getLotNumber() + ": Ocupat: " + parkingLot.isOccupied());
                }

                // cresterea capacitatii
                parkingSpace.setCapacity(12);

                System.out.println("Numarul locurilor de parcare dupa crestere: " + parkingSpace.getCapacity());
                System.out.println("Locurile de parcare dupa crestere:");
                for (ParkingLot parkingLot : parkingSpace.getParkingLots()) {
                    System.out.println("Locul de parcare " + parkingLot.getLotNumber() + ": Ocupat: " + parkingLot.isOccupied());
                }

                // scaderea capacitatii
                parkingSpace.setCapacity(8);

                System.out.println("Numarul locurilor de parcare dupa scadere: " + parkingSpace.getCapacity());
                System.out.println("Locurile de parcare dupa scadere:");
                for (ParkingLot parkingLot : parkingSpace.getParkingLots()) {
                    System.out.println("Locul de parcare " + parkingLot.getLotNumber() + ": Ocupat: " + parkingLot.isOccupied());
                }
            } else if ("3".equalsIgnoreCase(getOrSet)) {
                exit = Boolean.TRUE;
            }
        }

        scanner.close();

        System.out.println("Multumim pentru ca ne folositi aplicatia!");

        System.exit(0);
    }
}
