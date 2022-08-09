package Hotel;

public class Room {
    /*    hotelový pokoj     */
    /*
    Hosty vždy ubytováváme na pokojích (room).
    Pokoj je identifikován svým číslem.
    O každém pokoji chceme evidovat,
        kolik lůžek tam je (neřeš přistýlky apod.),
        zda má pokoj balkón
        a zda má výhled na moře
        a jaká je cena pokoje za jednu noc (předpokládej, že je cena pevně daná bez ohledu na sezónu a počet ubytovaných).
     */

    private int roomNumber;         //pokoj má číslo - identifikátor
    private int numberOfBed;        //pokoj má počet lůžek
    private boolean isBalcony;          //pokoj má balkón
    private boolean isSeaView;          //pokoj má výhled na moře
    private int roomRatePerNight;   //cena pokoje za jednu noc

    public Room(int roomNumber, int numberOfBed, boolean isBalcony, boolean isSeaView, int roomRatePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBed = numberOfBed;
        this.isBalcony = isBalcony;
        this.isSeaView = isSeaView;
        this.roomRatePerNight = roomRatePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isSeaView() {
        return isSeaView;
    }

    public void setSeaView(boolean seaView) {
        isSeaView = seaView;
    }

    public int getRoomRatePerNight() {
        return roomRatePerNight;
    }

    public void setRoomRatePerNight(int roomRatePerNight) {
        this.roomRatePerNight = roomRatePerNight;
    }

    // metoda pro výstup na zobrazovací zařízení s popisem objektu
    public void getDescription() {
        System.out.println("Číslo pokoje            : " + this.getRoomNumber());
        System.out.println("Počet postelí v pokoji  : " + this.getNumberOfBed());
        System.out.println("Cena pokoje ze jednu noc: " + this.getRoomRatePerNight() + " Kč.");
        if (this.isBalcony()) {
            System.out.println("Pokoj má balkon.");
        } else {
            System.out.println("Pokoj bez balkonu.");
        }
        if (this.isSeaView()) {
            System.out.println("Pokoj má výhled na moře.");
        } else {
            System.out.println("Pokoj bez výhledu na moře.");
        }
    }
}
