package Hotel;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    /*    rezervace pobytu     */
    /*
    V rámci jedné rezervace (booking) vždy přiřazujeme
        pokoj
        jednomu nebo více hostům
        na časové období mezi dvěma daty (například pokoj číslo 3 na období od 15. 7. do 24. 7. 2021).
        Pobyt je buď pracovní, nebo rekreační (type of vacation).
     */

    /*
    NÁPOVĚDA: Doporučené řešení vazby mezi rezervací, pokojem a hostem
        public class Booking {
        // ...
        private Room room;
        private Guest guest;
        private List<Guest> otherGuests;
        // ...
     */


    private Room bookingRoomNumber;                  //číslo rezervovaného pokoje
    private Guest bookingGuestIdentity;               //host nebo více hostů na pokoji
    private List<Guest> otherGuestsIdentity;
    private LocalDate bookingDateFrom;                    //období rezervace od
    private LocalDate bookingDateTo;                      //období rezervace do
    private StayType bookingStayType;                    //druh pobytu (pracovní nebo rekreační)
    public Booking(Room bookingRoomNumber,
                   Guest bookingGuestIdentity,
                   List<Guest> otherGuestsIdentity,
                   LocalDate bookingDateFrom,
                   LocalDate bookingDateTo,
                   StayType bookingStayType) {
        this.bookingRoomNumber = bookingRoomNumber;
        this.bookingGuestIdentity = bookingGuestIdentity;
        this.otherGuestsIdentity = otherGuestsIdentity;
        this.bookingDateFrom = bookingDateFrom;
        this.bookingDateTo = bookingDateTo;
        this.bookingStayType = bookingStayType;
    }


    public Booking(Room bookingRoomNumber,
                   Guest bookingGuestIdentity,
                   List<Guest> otherGuestsIdentity) {
        this.bookingRoomNumber = bookingRoomNumber;
        this.bookingGuestIdentity = bookingGuestIdentity;
        this.otherGuestsIdentity = otherGuestsIdentity;
        this.bookingDateFrom = LocalDate.now();
        this.bookingDateTo = LocalDate.now().plusDays(6);
        this.bookingStayType = StayType.REKREACNI;
    }

    public Room getBookingRoomNumber() {
        return bookingRoomNumber;
    }

    public void setBookingRoomNumber(Room bookingRoomNumber) {
        this.bookingRoomNumber = bookingRoomNumber;
    }

    public Guest getBookingGuestIdentity() {
        return bookingGuestIdentity;
    }

    public void setBookingGuestIdentity(Guest bookingGuestIdentity) {
        this.bookingGuestIdentity = bookingGuestIdentity;
    }

    public List<Guest> getOtherGuestsIdentity() {
        return otherGuestsIdentity;
    }

    public void setOtherGuestsIdentity(List<Guest> otherGuestsIdentity) {
        this.otherGuestsIdentity = otherGuestsIdentity;
    }

    public LocalDate getBookingDateFrom() {
        return bookingDateFrom;
    }

    public void setBookingDateFrom(LocalDate bookingDateFrom) {
        this.bookingDateFrom = bookingDateFrom;
    }

    public LocalDate getBookingDateTo() {
        return bookingDateTo;
    }

    public void setBookingDateTo(LocalDate bookingDateTo) {
        this.bookingDateTo = bookingDateTo;
    }

    public StayType getBookingStayType() {
        return bookingStayType;
    }

    public void setBookingStayType(StayType bookingStayType) {
        this.bookingStayType = bookingStayType;
    }

//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^BONIFIKACE^^^^^^^^^^^^^^^^
// Volitelně můžeš zkusit zařídit, aby se při vytváření rezervace
// rezervovalo automaticky na rekreační pobyt od dneška na dalších 6 nocí,
// pokud nezadáš konkrétní data začátku a konce.
// (Pokud uvedeš všechny parametry rezervace, použijí se tak, jak jsou zadané.)

    // metoda pro výstup na zobrazovací zařízení s popisem objektu
    public void getDescription() {
        System.out.println("Číslo pokoje     : " + this.getBookingRoomNumber().getRoomNumber());
        System.out.println("Rezervace od data: " + this.bookingDateFrom.toString() + " do data: " + this.bookingDateTo.toString());
        System.out.println("Pobyt            : " + this.bookingStayType.toString());
        System.out.println("Ubytovaný host   : " + this.getBookingGuestIdentity().getName() + " " +
                this.getBookingGuestIdentity().getSurname() + " " +
                this.getBookingGuestIdentity().getDateOfBirth().toString());
        if (!(getOtherGuestsIdentity().isEmpty())) {
            getOtherGuestsIdentity().listIterator().next();
            System.out.println("Ubytovaný host   : " + getOtherGuestsIdentity().listIterator().next().getName() + " " +
                    getOtherGuestsIdentity().listIterator().next().getSurname() + " " +
                    getOtherGuestsIdentity().listIterator().next().getDateOfBirth().toString());
        }
    }


    public enum StayType {PRACOVNI, REKREACNI}


}

