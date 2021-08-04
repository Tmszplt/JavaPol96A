package przyszlosc;

import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        /*John Smith zna przyszłość więc postanowił wykorzystać to znając ją.
        Ma do wyboru 3 strategie
        - W pierszym roku może pomnożyć zainwestowaną kwotę 100 razy
        i w każdym następnym roku o połowę mniej (50 razy, 25 razy, 12 razy, 6 razy, 3 razy, 1 raz,...)
        - W każdym kolejnym roku zainwestowana kwota rośnie o 2 razy
        - W pierwszym roku kwota rośnie o 10 % i w każdym następnym roku przyrost kwoty zwiększa się o 10 %.
        Podaj, która strategia jest najlepsza po N latach*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj zainwestowaną kwotę: ");
        double kwota = scanner.nextDouble();
        System.out.println("podaj liczbę lat: ");
        int n = scanner.nextInt();

        double str1 = kwota;
        double str2 = kwota;
        double str3 = kwota;
        double krotnosc = 5;
        double przyrost = 0.1;



        for (int i = 1; i <= n; i++) {
            str1 = str1*krotnosc;
            krotnosc /= 2;
            str2 *= 2;
            str3 = str3 + str3*przyrost;
            przyrost += 0.1;
        }


        System.out.println("strategia 1 daje nam: " + str1);
        System.out.println("strategia 2 daje nam: " + str2);
        System.out.println("strategia 3 daje nam: " + str3);
    }
}
