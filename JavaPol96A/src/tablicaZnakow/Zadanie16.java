package tablicaZnakow;
/* 6. Wczytaj n słów do dwuwymiarowej tablicy znaków. Każdy wiersz tablicy zawiera wyraz. Znajdź w tablicy takie wyrazy,
które składają się z tych samych liter (oczywiście w różnych położeniach).
 */

import java.util.Scanner;

public class Zadanie16 {
    private static int obliczLitery(String wyraz){
        int sumaLiter = 0;
        for(char c :wyraz.toCharArray()){
            sumaLiter += c;
        }return sumaLiter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę słów w tablicy");
        int n = scanner.nextInt();
        String[] tab1 = new String[n];
        scanner.nextLine();
        for (int i =0; i < n; i++){
            System.out.println("Podaj wyraz");
            String m = scanner.nextLine();
            tab1[i]= m;
        }
        for( int j = 0 ; j < n; j++){
            String wyraz1 = tab1[j];
            for(int k = j+1; k<n; k++){
                String wyraz2 = tab1[k];
                if (wyraz1.length() != wyraz2.length()){
                    continue;
                }
                int suma1 = obliczLitery(wyraz1);
                int suma2 = obliczLitery(wyraz2);
                if (suma1 == suma2)
                    System.out.println(wyraz1 +" + " +wyraz2);
            }
        }
    }
}
