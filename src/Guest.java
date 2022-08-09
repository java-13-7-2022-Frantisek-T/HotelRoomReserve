package Hotel;

import java.time.LocalDate;

public class Guest {
    /*    host     */
    /*
    Potřebujeme evidovat hosty (guest), které ubytováváme v hotelu.
    O každém hostu musíme uložit jméno, příjmení a datum narození.
     */

    private String name;           //jméno
    private String surname;        //příjmení
    private LocalDate dateOfBirth;    //datum narození

    public Guest(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // metoda pro výstup na zobrazovací zařízení s popisem objektu
    public void getDescription() {
        System.out.println("Jméno         : " + this.getName());
        System.out.println("Příjmení      : " + this.getSurname());
        System.out.println("Datum narození: " + this.getDateOfBirth().toString());
    }
}
