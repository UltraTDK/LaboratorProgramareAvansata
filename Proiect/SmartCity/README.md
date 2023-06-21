# Cum am structurat proiectul Smart City

* Proiectarea aplicatiei SmartCity:

o	Cerinta: “Creaza o aplicatie care sa administreze locurile de parcare si sa ofere asistenta soferilor.”

* 	Clasele necesare acestui proiect:

    *   ParkingSpace

    *	ParkingSpaceManager

    *	ParkingLot

    *	Vehicle

    *	SmartAssistant

    *	FeesHandler

* ParkingSpace: contine un numar ‘X’ de locuri de parcare.

* ParkingSpaceManager: administrarea in mod eficient a locurilor de parcare, poate include si functionalitati precum adaugarea sau eliminarea locurilor de parcare, actualizarea starii locurilor de parcare si generarea unui raport privind parcarea si locurile vacante.

* ParkingLot: contine doua informatii, daca este ocupat sau nu si numarul de inmatriculare al vehicului care este stationat.

* Vehicle: este un simplu actor care are un numar de inmatriculare pentru identificare.

* SmartAssistant: ofera informatii utile soferilor, precum disponibilitatea unui loc de parcare, pretul pe care trebuie sa-l plateasca si atribuie in mod automat un vehicul intr-un loc de parcare. Trimite notificari despre disponibilitatea locurilor de parcare, expirarea duratei de parcare, confirmarea unei rezervari sau orice actualizari legate de locurile de parcare

* FeesHandler: stabileste preturi pentru un loc de parcare, de exemplu 5 lei pentru 2 ore si calculeaza un pret de rezervare de exemplu o data la doua ore se mai adauga 5 lei.
