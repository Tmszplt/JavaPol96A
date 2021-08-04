package odsetki;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Program oblicza odsetki z lokaty bankowej
        // oprocentowanie roczne
        double procent = 1.03;
        double kwota = 1000;
        int lataLokaty = 5;
        Scanner skan = new Scanner(System.in);
        System.out.print("Podaj oprocentowanie ");
        procent = skan.nextDouble();
        System.out.print("Podaj kwotę lokaty ");
        kwota = skan.nextDouble();
        System.out.print("Podaj liczbę lat dla lokaty ");
        lataLokaty = skan.nextInt();
        int rok = 1;
        do {
            kwota = kwota * procent;
            rok++;
        } while (rok <= lataLokaty);
        System.out.format("Kwota na końcu lokaty: %8.2f zł" , kwota);
    }
}
