package DomekWGorach;
/*25. Wynajęcie domku w górach. Uprośćmy problem do możliwości wynajęcia domku w dniach od D1 do D2 mając tablicę Wynajęcia,
gdzie Wynajęcia[i] = 1 oznacza, że w dniu i domek jest już wynajęty, a 0 oznacza, że nie jest. Funkcja//metoda SprawdźWynajem(int D1, int D2)
zwraca true, jeśli domek można wynająć w terminie od D1 do D2 (zwraca false jeśli nie można wynająć), a metoda Wynajmij(int D1, int D2) wynajmuje
domek (zapisuje 1 w tablicy Wynajęcia na odpowiednich pozycjach)*/

public class Domek {
    private int[] wynajecie;
    private final int liczbaDniWRoku = 365;
    private String nazwa;

    public Domek(String nazwa) {
        this.nazwa = nazwa;
        wynajecie = new int[liczbaDniWRoku];
    }
    public Boolean sprawdzTermin (int D1, int D2){
        for(int i =D1; i<=D2;i++){
            if (wynajecie[i] == 1)
                return false;
        } return true;
    }

    public void podajZajetoscDomkuWDanymTerminie (int D1, int D2){
        for(int i =D1; i<=D2;i++){
            if (wynajecie[i] == 1)
                System.out.println(i + "  zajęty");
            else System.out.println(i + " wolny");
        }
    }

    public void WynajemDnia(int dzien) {
        if (wynajecie[dzien] == 1)
            System.out.println("Domek jest zajęty");
        else {
            wynajecie[dzien] = 1;
            System.out.println("Domek zarezerwowany");
        }

    }
    public void anulujRezerwacje(int D1, int D2){
        for(int i=D1; i<= D2; i++){
            wynajecie[i] = 0;
        }
    }


    public void WynajemWPrzedziale( int D1, int D2){
        if (sprawdzTermin(D1,D2) == false){
            System.out.println("W tym terminie domek jest zajęty");
        }else {
            System.out.println("Domek zarezerwowano");
            for (int i=D1; i<=D2; i++){
                wynajecie[i] = 1;
            }
        }
    }
}
