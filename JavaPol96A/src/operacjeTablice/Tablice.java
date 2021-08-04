package operacjeTablice;

/*
32.  Dla N-elementowej tablicy liczb całkowitych napisz funkcje, które
    - zwraca sumę elementów tablicy
    - zwraca suma dodatnich elementów tablicy
    - zwraca liczbę ujemnych elementów tablicy
    - zwraca tablicę w porządku odwróconym
    - zwraca posortowaną tablicę (użyj wbudowanej metody Arrays.sort)
    - zamienia elementy nieparzyste na ich podwojenie, a parzystym zmienia się znak na przeciwny (np. 4 -> -4)
    - za każdą ujemną wartością wstawia zero
    - liczby ujemne są zwiększane o 1, a dodatnie zmniejszane o 1
    Zmień program tak, aby cała funkcjonalność miała miejsce w klasie Table w postaci osobnych metod tej klasy
 */

import java.util.Arrays;

public class Tablice {

    int[] tablica;

    public Tablice(int[] tablica) {
        this.tablica = tablica;
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        return suma;
    }

    public int sumaDodatnich() {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > 0) suma += tablica[i];
        }
        return suma;
    }

    public void pokazTablicę() {
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i]+" ");
        }
        System.out.println();
    }

    public int sumaUjemnych() {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < 0) suma += tablica[i];
        }
        return suma;
    }

    /**
     * Metoda zwraca odwróconą tablicę.
     *
     * @return
     */
    public int[] tablicaOdwrócona() {
        int[] tabO = new int[tablica.length];
        for (int i = tablica.length, j = 0; i >= 0; i--, j++) {
            tabO[j] = tablica[i];
        }
        return tabO;
    }

    /**
     * Zwraca posortowaną tablicę
     *
     * @return
     */
    public int[] tablicaPosortowana() {
        int[] tabO = new int[tablica.length];

        for (int i = 0; i < tablica.length; i++) {
            tabO[i] = tablica[i];
        }
        Arrays.sort(tabO);
        return tabO;
    }

    /**
     * zamienia elementy nieparzyste na ich podwojenie, a parzystym zmienia się znak na przeciwny (np. 4 -> -4)
     */
    public void zamiana() {

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 2 == 0)
                tablica[i] = -tablica[i];
            else
                tablica[i] *= 2;
        }
    }

    /**
     * za każdą ujemną wartością wstawia zero
     */

    public void zaUjemną0() {
        int countU = 0;

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < 0) {
                countU++;
            }
        }
        int[] tab1 = new int[tablica.length+countU];

        for (int i = 0, j=0; i < tablica.length; i++) {
            if (tablica[i] < 0) {
                tab1[j] = tablica[i];
                tab1[j+1] = 0;
                j+=2;
            } else {
                tab1[j] = tablica[i];
                j++;
            }
        }
        tablica = tab1;
    }

    /**
     * liczby ujemne są zwiększane o 1, a dodatnie zmniejszane o 1
     */
    public void ujemneZwiększdodatnieZmniejsz() {

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < 0)
                tablica[i]++;
            else
                tablica[i]--;
        }
    }
}
