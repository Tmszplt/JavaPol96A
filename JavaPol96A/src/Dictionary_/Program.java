package Dictionary_;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zdanie = "";

        Dictionary slownik = new Dictionary(new String[]{"dom", "kot", "nie", "jest", "deszcz", "telewizor", "podłoga"});


        do {
            System.out.print("Podaj zdanie: ");
            zdanie = scanner.nextLine();
            if (!zdanie.equals("quit")) {
                System.out.print("Słowa których nie ma w słowniku: " + slownik.wordsNotInDictionary(zdanie) + "\t");
                System.out.print("\nSłowa które są w słowniku: " + slownik.wordsAreInDictionary(zdanie) + "\t");

            System.out.println();
            slownik.show();

            slownik.add("stół");
            slownik.show();

            slownik.remove("kot");
            slownik.show();

            slownik.getWord(4);
            System.out.println("Czy słowo kot znajduje się w słowniku: "+slownik.isInDictionary("kot"));
            }
        } while (!zdanie.equals("quit"));

        System.exit(1);
    }
}
