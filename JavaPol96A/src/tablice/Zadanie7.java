package tablice;
/*Zadanie 7
    Utwórz tablicę T zawierającą n losowych liczb całkowitych z przedziału 1...m. Znajdź długość najdłuższego
    ciągu takich samych wartości.
    Znajdź długość najdłuższego ciągu wartości większych niż średnia arytmetyczna liczb z tablicy T.*/

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int n = scanner.nextInt();
        int[] tab1 = new int[n];
        System.out.println("Podaj granicę przedziału");
        int m = scanner.nextInt();
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < n; i++) {
            tab1[i] = random.nextInt(m);
            System.out.print(tab1[i] + " ");
        }
        int wartosc = tab1[0];
        int dlugosc = 0;
        int max = 1;
        System.out.println();
        for (int i = 1; i < n; i++) {
            if (tab1[i] == wartosc) {
                dlugosc++;
            } else {
                if (dlugosc > max) {
                    max = dlugosc;
                }
                    wartosc = tab1[i];
                    dlugosc = 1;
                }
            }
        if( dlugosc> max){
            max = dlugosc;
        }
        System.out.println(max);
    }
}
