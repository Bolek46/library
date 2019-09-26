public class Czytelnik {

    String Imie;
    String Nazwisko;
    String Data_DDMMRR;
    String ID;

    Czytelnik()
    {
        Imie = "aaaaaaaa";
        Nazwisko = "aaaaaaaaa";
        Data_DDMMRR = "aaaaaaaaaa";
        IdentyfikatorCzytelnika ID2=new IdentyfikatorCzytelnika(Imie,Nazwisko,Data_DDMMRR);
        ID=ID2.toString();
    }

    public Czytelnik(String imie, String nazwisko, String data_DDMMRR) {
        Imie = imie;
        Nazwisko = nazwisko;
        Data_DDMMRR = data_DDMMRR;
        IdentyfikatorCzytelnika ID2=new IdentyfikatorCzytelnika(imie,nazwisko,data_DDMMRR);
        ID=ID2.toString();
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getData_DDMMRR() {
        return Data_DDMMRR;
    }
}
