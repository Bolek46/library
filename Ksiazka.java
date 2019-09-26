public class Ksiazka {

    String Tytuł;
    String Autor;
    int Rok_wydania;
    String Wydawnictwo;
    String ID;
    int Ilość;
    boolean Dostępność;


    public Ksiazka() {
        Tytuł = " ";
        Autor = " ";
        Rok_wydania = 0;
        Wydawnictwo = " ";
        Ilość = 0;
        Identyfikator ID2=new Identyfikator(Tytuł,Autor,Rok_wydania,Ilość);
        this.ID =ID2.toString();
        Dostępność = false;
    }

    public Ksiazka(String tytuł, String autor, int rok_wydania, String wydawnictwo, String ID, int ilość, boolean dostępność) {
        Tytuł = tytuł;
        Autor = autor;
        Rok_wydania = rok_wydania;
        Wydawnictwo = wydawnictwo;
        Identyfikator ID2=new Identyfikator(tytuł,autor,rok_wydania,ilość);
        this.ID =ID2.toString();
        Ilość = ilość;
        Dostępność = dostępność;
    }

    public Ksiazka(String tytuł, String autor, int rok_wydania, String wydawnictwo) {
        Tytuł = tytuł;
        Autor = autor;
        Rok_wydania = rok_wydania;
        Wydawnictwo = wydawnictwo;
        Ilość = 1;
        Identyfikator ID2= new Identyfikator(tytuł,autor,rok_wydania,Ilość);
        this.ID =ID2.toString();
        Dostępność =true;

    }


    public String getTytuł() {
        return Tytuł;
    }

    public String getAutor() {
        return Autor;
    }

    public int getRok_wydania() {
        return Rok_wydania;
    }

    public String getWydawnictwo() {
        return Wydawnictwo;
    }

    public String getID() {
        return ID;
    }

    public int getIlość() {
        return Ilość;
    }

    public boolean isDostępność() {
        return Dostępność;
    }


    public String toString()
    {
        return "Tytuł: "+Tytuł+" Autor: "+Autor+" Rok Wydania: "+Rok_wydania+" Wydawnictwo: "+Wydawnictwo+" ID Ksiązki: "+ID+" Ilosc Egzemplarzy: "+Ilość;
    }
}
