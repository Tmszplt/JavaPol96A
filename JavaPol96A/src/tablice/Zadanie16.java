package tablice;

import java.util.Scanner;

/*16. Wczytaj n słów do jednowymiarowa tablicy słów. Każdy wiersz tablicy zawiera wyraz.
Znajdź w tablicy takie wyrazy, które składają się z tych samych liter (oczywiście w różnych położeniach).
*/
public class Zadanie16 {
    private static int obliczLitery(String wyraz){
        int sumaLiter = 0;
        for(char C : wyraz.toCharArray()){
            sumaLiter += C;
        }
        return sumaLiter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę słów w tablicy: ");
        int n = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        String[] tab1 = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj wyraz");
            String m = scanner.nextLine();
            tab1[i] = m;
        }
        for (int j = 0; j < n - 1; j++) {
            String wyraz1 = tab1[j];
            for (int k = j + 1; k < n; k++) {
                String wyraz2 = tab1[k];
                if (wyraz1.length() != wyraz2.length()){
                    continue;
                }
                int suma1 = obliczLitery(wyraz1);
                int suma2 = obliczLitery(wyraz2);
                if (suma1 == suma2){
                    System.out.println(wyraz1 + " " + wyraz2);
                }
            }
        }
//        System.out.println(tab1.toString());
    }
}
