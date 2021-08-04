package proste;

import java.util.Random;

public class Loops {
    private static final int SIZE = 10_000;
    public static void main(String[] args) {
        int suma = 0;
        int[] tab = new int[SIZE];
        Random los = new Random();
        for(int i = 0;  i < SIZE; i++)
            tab[i] = los.nextInt(667);

        for (int li : tab) {
            if (li % 3 == 0)
                suma += li;
        }
        for (int i = 1; i < SIZE; i++) {
            if (tab[i] % 3 == 0)
                suma += tab[i];
            if (tab[i] == 666)
                break;
        }
        // wersja do .. while
        suma = 0;
        boolean koniec = false;
        int i = 1;
        do {
            if (tab[i] %3 == 0)
                suma += tab[i];
            if (tab[i] == 666)
                koniec = true;
            i++;
        } while (i < 10_000 && !koniec);
    }
}
