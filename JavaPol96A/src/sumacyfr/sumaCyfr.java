package sumacyfr;

import java.util.Scanner;

public class sumaCyfr {
    public static void main(String[] args) {

        /*Suma cyfr dla liczby X (np. X = 2021, suma cyfr = 2 + 0 + 2 + 1 = 5)
        Wypisz liczby od 1 do 1000, dla których suma cyfr wynosi N (np. N = 9)*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ile ma wynosić suma cyfr: ");
        int wybrana = scanner.nextInt();
        int liczba = 0;
        int cyfra = 0;

        for (int j = 1; j <= 1000; j++) {
            int sumaCyfr = 0;
            int x = j;
            do {
                cyfra = x % 10;
                sumaCyfr += cyfra;
                x /= 10;
            } while (x>0);

            if (wybrana == sumaCyfr) System.out.println(j);

        }
    }
}