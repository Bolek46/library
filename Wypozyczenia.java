import java.time.ZonedDateTime;

public class Wypozyczenia {

    String ID_czytelnika;
    String ID_ksiazki;
    String Data_zwrotu;

    public Wypozyczenia() {
        this.ID_czytelnika = "  ";
        this.ID_ksiazki = "   ";
        Data_zwrotu = " ";
    }

    public Wypozyczenia(String ID_czytelnika, String ID_ksiazki, String data_zwrotu) {
        this.ID_czytelnika = ID_czytelnika;
        this.ID_ksiazki = ID_ksiazki;
        Data_zwrotu = data_zwrotu;
    }

    public String getID_czytelnika() {
        return ID_czytelnika;
    }

    public String getID_ksiazki() {
        return ID_ksiazki;
    }

    public String getData_zwrotu() {
        return Data_zwrotu;
    }
}
