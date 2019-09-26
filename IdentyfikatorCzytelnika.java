import java.util.Random;

public class IdentyfikatorCzytelnika {

    String ID;
    Random random=new Random();
    int liczba;
    IdentyfikatorCzytelnika(String Imie,String Nazwisko,String Rok_urodzenia)
    {
        liczba=(random.nextInt(900))+100;
        ID=Imie.substring(0,1)+Nazwisko.substring(0,1)+Rok_urodzenia.substring(6,10);
    }

    public String toString()
    {
        return ID.toUpperCase()+Integer.toString(liczba);
    }

}

