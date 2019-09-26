import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Menu {



    public static void main(String[] args) {

        //Deklaracje zmiennnych używanych w tej klasie
        Scanner odczyt = new Scanner(System.in);
        Scanner wprowadzanie = new Scanner(System.in);
        String szukanie;
        String ID_czytelnika;
        String ID_Ksiaki;


        //Deklaracje obiektów i zmiennych do obiektów/////////
        String Tytuł;
        String Autor;
        int Rok_wydania;
        String Wydawnictwo;
        int Ilość;
        boolean Dostępność;

        Ksiazka[] ksiazka = new Ksiazka[3];
        ksiazka[0] = new Ksiazka("Wypełnienie", "ja", 1998, "NowaEra", "111111111", 5, false);
        ksiazka[1] = new Ksiazka("lolo2", "ja", 1298, "NowaEra", "111111111", 5, false);
        ksiazka[2] = new Ksiazka("lolo3", "ja", 1265, "NowaEra", "111111112", 5, false);


        String Imie;
        String Nazwisko;
        String Data_DDMMRR;

        Czytelnik[] czytelnik = new Czytelnik[2];
        czytelnik[0] = new Czytelnik("Adam", "Kowalski", "21-09-1998");
        czytelnik[1] = new Czytelnik("Janusz", "Marchew", "12-12-1965");
        czytelnik[0].ID = "AK1998";
        czytelnik[1].ID = "JM6038";


        Wypozyczenia[] wypozyczenia = new Wypozyczenia[3];
        wypozyczenia[0] = new Wypozyczenia("AK1998", "111111111", "2018-12-21");
        wypozyczenia[1] = new Wypozyczenia();
        wypozyczenia[2] = new Wypozyczenia();


        //////////////////////////////

        System.out.println("Witaj w Wypożyczalni! Co chcesz zrobić? Wprowadz odpowiednią cyfrę przy danej opcji");
            System.out.println("1-Dodawanie ksiązki do bazy.");
            System.out.println("2-Dodawanie nowego czytelnika.");
            System.out.println("3-Wyszukiwanie ksiązek.");
            System.out.println("4-Wypożyczenie ksiązki.");
            int opcja = odczyt.nextInt();
            switch (opcja) {
                case 1:
                    System.out.println("Dodajesz nową ksiązkę bazy.");
                    System.out.println("Wprowadz tytuł: ");
                    Tytuł = wprowadzanie.nextLine();
                    System.out.println("Wprowadz autora: ");
                    Autor = wprowadzanie.nextLine();

                    label:
                    {
                        for (int i = 0; i < ksiazka.length; i++) {
                            if (ksiazka[i].Tytuł.equals(Tytuł) && ksiazka[i].Autor.equals(Autor)) {
                                ksiazka[i].Ilość++;
                                System.out.println("Ksiazka już istnieje. Egzemplarz został dodany");
                                break label;
                            }
                        }

                        System.out.println("Wprowadz rok wydania:");
                        Rok_wydania = odczyt.nextInt();
                        System.out.println("Wprowadz wydawnictwo:");
                        Wydawnictwo = wprowadzanie.nextLine();


                        ksiazka[2] = new Ksiazka(Tytuł, Autor, Rok_wydania, Wydawnictwo);
                        System.out.println(ksiazka[2].ID);
                    }
                    break;
                case 2:
                    System.out.println("Dodajesz nowego Czytelnika");
                    System.out.println("Wprowadz Imie");
                    Imie = wprowadzanie.nextLine();
                    System.out.println("Wprowadz Nazwisko:");
                    Nazwisko = wprowadzanie.nextLine();
                    System.out.println("Wprowadz Rok Urodzenia (DD-MM-RR");
                    Data_DDMMRR = wprowadzanie.nextLine();
                    label:
                    {
                        for (int i = 0; i < czytelnik.length; i++) {
                            if (czytelnik[i].Imie.equals(Imie) && czytelnik[i].Nazwisko.equals(Nazwisko) && czytelnik[i].Data_DDMMRR.equals((Data_DDMMRR))) {
                                System.out.println("Czytelnik jest juz w bazie danych");
                                break label;
                            }
                        }
                        System.out.println("Udało sie prawdłowo dodać czytelnika");
                        czytelnik[1] = new Czytelnik(Imie, Nazwisko, Data_DDMMRR);
                        System.out.println(czytelnik[1].Imie + czytelnik[1].Nazwisko + czytelnik[1].getData_DDMMRR() + " " + czytelnik[1].ID + " ");
                    }
                    break;
                case 3:
                    System.out.println("Wyszukiwarka ksiązek. Wpisz frazę którą chcesz znaleźć");
                    szukanie = wprowadzanie.nextLine();
                    label:
                    {
                        for (int i = 0; i < ksiazka.length; i++) {
                            if (ksiazka[i].Tytuł.equalsIgnoreCase(szukanie) || ksiazka[i].Autor.equalsIgnoreCase(szukanie) || ksiazka[i].ID.equalsIgnoreCase(szukanie)) {

                                if (ksiazka[i].Dostępność == false) {
                                    System.out.println("Niestety nie mamy wolnych egzemplarzy. Data zwrotu to : "+wypozyczenia[i].Data_zwrotu);
                                    System.out.println(ksiazka[i].toString());
                                    if(i==ksiazka.length-1)break label;
                                } else {
                                    System.out.println("Ksiązką jest w naszej biblotece i jest gotowa do wypozyczenia");
                                    System.out.println(ksiazka[i].toString());
                                    if(i==ksiazka.length-1)break label;
                                }

                            }
                        }
                        System.out.println("Nie posiadamy ksiązki o takim tytule, autorze bądz numerze ID spróbuj wpisać inną frazę");
                    }
                    break;
                case 4:
                    System.out.println("opcja 4");
                    System.out.println("Wypożyczanie ksiązek.");
                    System.out.println("Wprowadz ID czytelnika: ");
                    System.out.println(czytelnik[1].ID);
                    ID_czytelnika = wprowadzanie.nextLine();

                    label:
                    {
                        for (int i = 0; i < czytelnik.length; i++) {
                            if (czytelnik[i].ID.equalsIgnoreCase(ID_czytelnika)) {
                                for (int j = 0; j < wypozyczenia.length; j++) {
                                    if (czytelnik[i].ID.equalsIgnoreCase(wypozyczenia[j].ID_czytelnika)) {
                                        System.out.println("Użytkownik nie zwrócił poprzedniej ksiązki i nie może wypożyczyć następnej");
                                        break label;
                                    }
                                }
                                System.out.println("Wprowadz ID ksiązki którą chcesz wypożyczyć");
                                System.out.println(ksiazka[i].ID);
                                ID_Ksiaki = wprowadzanie.nextLine();

                                for (int j = 0; j < ksiazka.length; j++) {
                                    if (ksiazka[j].ID.equalsIgnoreCase(ID_Ksiaki)) {
                                        for (int k = 0; k < wypozyczenia.length; k++) {
                                            if (ksiazka[j].ID.equalsIgnoreCase(wypozyczenia[k].ID_ksiazki)) {
                                                System.out.println("Ksiązka jest właśnie wypożyczona. Nie można jej wypożyczyć spróbuj inne ID");
                                                break label;
                                            }
                                        }
                                    }
                                }
                                ZonedDateTime zonedDateTime = ZonedDateTime.now();
                                ZonedDateTime Data_zwrotu = zonedDateTime.plus(Period.ofDays(30));
                                wypozyczenia[2] = new Wypozyczenia(ID_czytelnika, ID_Ksiaki, Data_zwrotu.toString().substring(0, 10));
                                System.out.println("Udało ci się wypożyczyć ksiązkę. Twój termin zwrotu to: " + Data_zwrotu.toString().substring(0, 10));
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("Błędny numer! Nie ma takiej opcji.");

            }



    }

}
