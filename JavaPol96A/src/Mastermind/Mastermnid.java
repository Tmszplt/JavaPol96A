package Mastermind;
/* 38. Bardzo prosta gra w mastermind'a. Komputer losuje 5 zer lub jedynek. Gracz powinien zgadnąć po maksymalnie 10 próbach układ zer i jedynek.
    Za każdą próbą gracz otrzymuje informację zwrotną w postaci liczby trafień i liczby zgodnych "kolorów".
    Np. dla układu: 10101
    1 układ gracza: 00110 | 2 trafienia, 2 zgodne kolory
    2 układ gracza: 10101 | 3 trafienia, 2 zgodne kolory
    3 ukłąd gracza: 11001 | 3 trafienia, 2 zgodne kolory
    4 układ gracza: 10101 | 5 trafień
    Spróbuj napisać wersję, w której może pojawić się 0, 1 lub 2*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mastermnid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] gotowe = new char[5];
        Random losowe = new Random();
        for (int i = 0; i < 5; i++) {
            switch (losowe.nextInt(2)) {
                case 0:
                    gotowe[i] = '0';
                    break;
                case 1:
                    gotowe[i] = '1';
                    break;
                case 2:
                    gotowe[i] = '2';
                    break;
                case 3:
                    gotowe[i] = '3';
                    break;
                case 4:
                    gotowe[i] = '4';
                    break;
                case 5:
                    gotowe[i] = '5';
            }

        }

        int count = 0;
        boolean isEnd = false;
        do {
            System.out.println("Podaj swój wzór: ");
            String userInput = sc.nextLine();
            if (userInput.length() != 5) {
                System.out.println("Wzór musi byc 5 - znakowy.");
                count++;
                continue;
            }

            char[] userSymbols = userInput.toCharArray();
            int trafione = 0;
            String g1 = "";
            String u1 = "";

            for (int i = 0; i < 5; i++) {
                if (userSymbols[i] == gotowe[i]) {
                    trafione++;
                } else {
                    g1 += gotowe[i];
                    u1 += userSymbols[i];
                }
            }

            if (trafione == 5) {
                System.out.println("Brawo, zgadleś wzór. Koniec gry.");
                isEnd = true;
            } else {
                int iloscKolorow = 0;
                char[] g1Char = g1.toCharArray();
                char[] u1Char = u1.toCharArray();

                Arrays.sort(g1Char);
                Arrays.sort(u1Char);

                // 1 2 8 9
                // 2 3 8
                // 1 2 2 3 8 8 9
                int i1 = 0;
                int i2 = 0;
                do {
                    if (g1Char[i1] == u1Char[i2]) {
                        iloscKolorow++;
                        i1++;
                        i2++;
                    } else {
                        if (g1Char[i1] < u1Char[i2]) {
                            i1++;
                        } else {
                            i2++;
                        }
                    }
                } while (i1 < g1Char.length && i2 < g1Char.length);

                System.out.printf("Trafione: %d, zgodne kolory: %d.%n", trafione, iloscKolorow);
                count++;
            }
        } while (count < 10 && !isEnd);

        if (isEnd == false) {
            System.out.println("Przegrałeś!");
        }

    }
}
