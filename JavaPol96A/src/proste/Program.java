package proste;

import java.util.Random;
import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną
typu float) i
obliczy obwód tego okręgu. Do obliczeń przyjmij najpierw π = 3.14, a
następnie skorzystaj z wbudowanej klasy Math i znajdującej się tam stałej PI.
 */
public class Program {
    public static void main(String[] args) {
        double d;
        Scanner skan = new Scanner(System.in);
        System.out.print("Podaj średnicę ");
        d = skan.nextDouble();
        //double pi = 3.14;
        double ob =  Math.PI * d;
        System.out.println("Obwód wynosi: " + ob);
    }
}
