package liczbydoskonale;
//Wyświetlenie podzielników (całkowitych) liczby X
//Suma podzielników liczby X
//Czy liczba jest doskonała (suma podzielników równa liczbie, np. 6 = 1 + 2 + 3)
//Szukamy liczby powyzej x, ktora jest doskonala

import java.util.Scanner;
public class doskonale {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            int x = scanner.nextInt();
            boolean koniec = false;
            do {
                System.out.print(x + " : ");
                int sum = 0;
                for (int i = 1; i < x; i++) {
                    if (x % i == 0) {
                        System.out.print(i + " ");
                        sum = sum + i;
                    }
                }
                System.out.println();
                System.out.println(sum);
                System.out.println();
                if (sum == x) {
                    System.out.println("Liczba jest doskonala");
                    koniec = true;
                } else {
                    System.out.println("Liczba nie jest doskonala");
                }
                x++;
            }while(!koniec);
        }
    }
