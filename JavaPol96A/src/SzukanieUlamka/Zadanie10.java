package SzukanieUlamka;

import java.util.Scanner;

/*
Zadanie 10
    Wczytaj liczbę rzeczywistą W (liczba większa od zera i mniejsza od 1).
    Znajdź ułamek o mianowniku mniejszym od 100 000, który jest najmniej odległy od W.
 */
public class Zadanie10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe rzeczywista z przedzialu 0 - 1");
        double w = scanner.nextDouble();
        double min = w;
        double licznik = 1;
        double mianownik = 1;

        do{
            double ulamek = licznik/mianownik;
            if (ulamek > w)
                mianownik++;
            else{
                licznik++;
            }
            double odleglosc = Math.abs(ulamek - w);
            if (odleglosc < min){
                min = odleglosc;
                System.out.println("Szukany ulamek to " + licznik +" /" + mianownik + " odleglosc od w to " + odleglosc);
            }

        }while ( mianownik < 100_000);


    }
}