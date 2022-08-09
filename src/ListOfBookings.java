package Hotel;

import java.util.List;

public class ListOfBookings {
    /*   seznam rezervací   */
    /*
    Chceme také mít k dispozici třídu, která bude uchovávat všechny rezervace (například list of bookings),
    které jsme v systému vytvořili a bude mít metodu, která vypíše informace o všech rezervacích.
    */

    private List<Booking> bookingList;

    //  Konstruktor
    public ListOfBookings(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }


    // metoda pro výstup na zobrazovací zařízení s popisem objektu
    // použil jsem v Hotel.Main metodu pro zobrazování té které rezervace při průchodu kolekcí
}
