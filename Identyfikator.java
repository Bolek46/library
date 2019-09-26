public class Identyfikator {

    String TytułAutor;
    int kolejnośc;
    int rok_wydania;

    Identyfikator(String Tytuł,String Autor,int rok_wydania,int kolejnoścl)
    {
        TytułAutor=Tytuł.substring(0,2)+Autor.substring(0,2);
        //TytułAutor.toUpperCase();
        this.kolejnośc=kolejnoścl;
        this.rok_wydania=rok_wydania;
    }

    public String getTytułAutor()
    {
        return TytułAutor;
    }

    public String toString()
    {
        return (TytułAutor+Integer.toString(rok_wydania)+Integer.toString(kolejnośc)).toUpperCase();
    }

}
