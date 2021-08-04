package losowanie;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner skan =  new Scanner(System.in);
                String[] osoby = new String[]{
                "Arkadiusz Przychocki",
                "Grzegorz Orłowski",
                "Jarosław Łada",
                "Julia Yu",
                "Kamil Lewandowski",
                "Karol Kowalczyk",
                "Karol Prukop",
                "Łukasz Soczko",
                "Przemysław Otoliński",
                "Radosław Kowalik",
                "Sylwia Motylińska",
                "Tomasz Piłat",
                "Damian Szczepaniak"
        };
        int rozmiar = osoby.length;
        int[] wylosowane = new int[rozmiar];
        for(int i = 0; i < rozmiar; i++)
            wylosowane[i] = 0;
        Random los = new Random(System.currentTimeMillis());
        boolean koniec = false;
        int liczbaPrób = 0;
        do {
            int kto = los.nextInt(osoby.length);
            if (wylosowane[kto] == 0) {
                System.out.println("Osoba wylosowana: " + osoby[kto]);
                wylosowane[kto] = 1;
                liczbaPrób = 0;
                System.out.println("1 = losujemy, 0 = koniec programu");
                int liczba = skan.nextInt();
                if (liczba == 0)
                    koniec = true;
            }
            else
                if(++liczbaPrób > 8)
                    koniec = true;
        } while (!koniec);
    }
}
