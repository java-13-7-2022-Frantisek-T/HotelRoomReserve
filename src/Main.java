package Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public abstract class Main {

    /* František T. - java-13-7-2022 */

    public static void main(String[] args) {

    /*
    Vytvoř hosty Adélu Malíkovou (narozena 13. 3. 1993) a Jana Dvořáčka (narozen 5.5.1995).
    Vypiš na obrazovku jejich popis (description).
    Vytvoř pokoje a vypiš na obrazovku jejich popis:
        pokoj číslo 1 a pokoj číslo 2 jsou jednolůžkové za cenu 1000 Kč/noc, s balkonem a výhledem na moře.
        pokoj číslo 3 je trojlůžkový za cenu 2400 Kč/noc, bez balkónu, s výhledem na moře.
    Připrav rezervace:
        pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.
        pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
    Vypiš seznam všech rezervací.
     */


//  Vytvoř hosta Adélu Malíkovou (narozena 13. 3. 1993)
        Guest firstGuest = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
//  Vytvoř hosta Jana Dvořáčka (narozen 5.5.1995).
        Guest secondGuest = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

//  Vypiš na obrazovku jejich popis (description).
        System.out.println("Hosté  (popis)");
        System.out.println("---------------------------");
        firstGuest.getDescription();
        System.out.println("---------------------------");
        secondGuest.getDescription();
        System.out.println("---------------------------");
        System.out.println();

//  Vytvoř pokoj číslo 1 je jednolůžkový za cenu 1000 Kč/noc, s balkonem a výhledem na moře.
        Room firstRoom = new Room(1, 1, TRUE, TRUE, 1000);
//  Vytvoř pokoj číslo 2 je jednolůžkový za cenu 1000 Kč/noc, s balkonem a výhledem na moře.
        Room secondRoom = new Room(2, 1, TRUE, TRUE, 1000);
//  Vytvoř pokoj číslo 3 je trojlůžkový  za cenu 2400 Kč/noc, bez balkónu, s výhledem na moře.
        Room thirdRoom = new Room(3, 3, FALSE, TRUE, 2400);

//  Vypiš na obrazovku popis pokojů:
        System.out.println("Pokoje  (popis)");
        System.out.println("===========================");
        firstRoom.getDescription();
        System.out.println("===========================");
        secondRoom.getDescription();
        System.out.println("===========================");
        thirdRoom.getDescription();
        System.out.println("===========================");
        System.out.println();

//  Připrav rezervaci pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.
        Booking firstBooking = new Booking(firstRoom,
                firstGuest,
                List.of(),
                LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26),
                Booking.StayType.PRACOVNI
        );

//  Připrav rezervaci pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
        Booking secondBooking = new Booking(thirdRoom,
                firstGuest,
                List.of(secondGuest),
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14),
                Booking.StayType.REKREACNI
        );


//  Zkoušení konstruktoru bez zadávání datumů rezervace od a do
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^BONIFIKACE^^^^^^^^^^^^^^^^
        Booking thirdBooking = new Booking(secondRoom,
                secondGuest,
                List.of(firstGuest)
        );


//  Vypiš seznam všech rezervací.
        System.out.println("Výpis rezervací");
        System.out.println("///////////////////////////");
        firstBooking.getDescription();
        System.out.println("///////////////////////////");
        secondBooking.getDescription();
        System.out.println("///////////////////////////");
        System.out.println();


//  Jestě jednou to samé, ale pokročilejší technikou přes kolekci
//  *************************************************************
//  Vytvořím kolekci
        ArrayList<Booking> listOfBookings = new ArrayList<>();


//  Uložím objekt do kolekce (přidám do kolekce první rezervaci)
        listOfBookings.add(firstBooking);
//  Uložím objekt do kolekce (přidám do kolekce druhou rezervaci)
        listOfBookings.add(secondBooking);

//  Zkoušení konstruktoru bez zadávání datumů rezervace od a do (třetí rezervace)
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^BONIFIKACE^^^^^^^^^^^^^^^^
        listOfBookings.add(thirdBooking);


//  Vypíšu počet objektů v kolekci
        System.out.println("Počet evidovaných rezervací: " + listOfBookings.size());

//  Pokud je počet objektů v kolekci nulový, vypíšu o tom informaci
        if (listOfBookings.isEmpty()) {
            System.out.println("Seznamu rezervací je prázdný!");
        } else {
//  Provedu akci se všemi objekty v kolekci (vypíšu jejich popis)
            System.out.println("Výpis seznamu rezervací: ");
            for (Booking booking : listOfBookings) {
                booking.getDescription();
                System.out.println("+++++++++++++++++++++++++++");
            }
        }

//  Úklid paměti poté, co již kolekci nepotřebuji .... Moje hraní si a zkoušení ......
//  **************************************************************************************
//  Smažu jeden prvek v kolekci (konkrétně ten poslední)
        if (!(listOfBookings.size() == 0)) {
            listOfBookings.remove(listOfBookings.size() - 1);
        }
//  Smažu naráz celou kolekci
        listOfBookings.clear();
    }

}