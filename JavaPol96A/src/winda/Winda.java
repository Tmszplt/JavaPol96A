package winda;

import java.util.Scanner;

public class Winda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ile jest pięter: ");
        int levels = scanner.nextInt();
        Lift winda = new Lift(levels);

        boolean koniec = false;

        do {
            System.out.println("0 - dodawanie pasażerów, 1 - winda do góry, 2 - winda w dół, 3 - wylistowanie pasażerów, 4 - koniec");
            int polecenie = scanner.nextInt(5);

            switch (polecenie) {
                case 0:
                    System.out.println("podaj ilu pasażerów wsiada: ");
                    int iluwsiada = scanner.nextInt();
                    for (int i = 0; i < iluwsiada; i++) {
                        System.out.println("na którym piętrze wysiada pasażer: ");
                        int piętro = scanner.nextInt();
                        winda.addPassenger(piętro);
                    }
                break;
                case 1:
                    winda.up();
                    winda.stop();
                break;
                case 2:
                    winda.down();
                    winda.stop();
                break;
                case 3:
                    winda.list();
                break;
                case 4:
                    koniec = true;
            }
        }while (!koniec);

    }
}

