package firma;

/*
30. Utwórz klasę Pracownik. Utwórz konstruktor z polami imię, nazwisko, stanowisko, pensja (double). Napisz metodę toString(), która zwraca informacje o
   pracowniku.
 */
public class Pracownik {
    private String imie;
    private String nazwisko;


    private String stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, String stanowisko, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public double getPensja() {
        return pensja;
    }

    @Override
    public String toString() {
        return String.format("%s %s stanowiko - %s, pensja - %.2f", imie, nazwisko, stanowisko, pensja);
    }
}
