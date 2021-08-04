package DomekWGorach;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj nazwę domku");
        Domek domek = new Domek(scanner.nextLine());
        //domek.WynajemWPrzedziale(22,34);
        //domek.podajZajetoscDomkuWDanymTerminie(20,30);
        boolean koniec = false;

        do{
            System.out.println("Lista możliwości : 0 - Sprawdzenie terminu, 1 - Rezerwacja, 2 - Zjetość domku w terminie, 3- Anulowanie rezerwacji, 4 - Koniec");
            int wybor = scanner.nextInt(5);
            switch (wybor){
                case 0 :
                    System.out.println("Podaj termin rozpoczęcia rezerwacji");
                    int dzienPoczatkowy = scanner.nextInt();
                    System.out.println("Podaj zakończenia rezerwacji");
                    int dzienOstatni = scanner.nextInt();
                    if (domek.sprawdzTermin(dzienPoczatkowy,dzienOstatni)){
                    System.out.println("Rezerwacja możliwa");
                }else System.out.println("Rezerwacja niemożliwa");
                    break;
                case 1 :
                    System.out.println("Podaj termin rozpoczęcia rezerwacji");
                    int dzien1 = scanner.nextInt();
                    System.out.println("Podaj zakończenia rezerwacji");
                    int dzien2 = scanner.nextInt();
                    domek.WynajemWPrzedziale(dzien1,dzien2);
                break;
                case 2 :
                    System.out.println("Podaj od kiedy");
                    int dzienFirst = scanner.nextInt();
                    System.out.println("Podaj do kiedy");
                    int dzienLast = scanner.nextInt();
                    domek.podajZajetoscDomkuWDanymTerminie(dzienFirst,dzienLast);
                    break;
                case 3 :
                    System.out.println("Podaj od kiedy");
                    dzienFirst = scanner.nextInt();
                    System.out.println("Podaj do kiedy");
                    dzienLast = scanner.nextInt();
                    domek.anulujRezerwacje(dzienFirst,dzienLast);
                    System.out.println("Rezerwacja anulowana");
                    break;
                case 4 : koniec = true;
            }
        }while (!koniec);
    }
}
