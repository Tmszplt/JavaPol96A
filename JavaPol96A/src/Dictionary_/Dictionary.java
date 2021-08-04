package Dictionary_;
/*
31. Napisz klasę Dictionary, która posiada pole 'words' w postaci tablicy napisów (String[]). Dodaj metody:
    - add (dodająca słowo do 'words')
    - remove (usuwająca słowo z 'words')
    - get(int i) - pobierająca słowo o numerze i w tablicy 'words'
    - isInDictionary(String s) - sprawdzająca czy słowo 's' jest w tablicy 'words' (zwraca true), lub zwraca false jeśli słowa tam nie ma

    - metoda sprawdzająca podane jako parametr zdanie. Wypisuje te słowa ze zdania, których nie ma w słowniku
    - metoda sprawdzająca podane jako parametr zdanie. Wypisuje te słowa ze zdania, które są w słowniku
    Program powinien działać w pętli i pozwalać użytkownikowi na wpisywanie zdań, a jeżli użytkownik wpisze 'quit', to program kończy działanie
    Po wypisaniu nieznanych słów użytkownik powinien mieć możliwość dodania tych nieznanych słów do słownika.
 */

public class Dictionary {

    String[] words = new String[100];
    int wordCount = 0;

    public void add(String word) {
        words[wordCount] = word;
        System.out.println("Do słownika dodano słowo: "+word);
        wordCount++;
    }

    public void show() {
        System.out.print("Zawartość słownika: ");
        for (int i = 0; i < wordCount; i++) {
            System.out.print(words[i] + " | ");
        }
        System.out.println();
    }

    public void remove(String word) {
        for (int i = 0; i < wordCount; i++) {
            if (words[i].equals(word)) {
                System.out.println("Ze słownika usunięto słowo: " + words[i]);
                for (int j = i; j < wordCount - 1; j++)
                    words[j] = words[j + 1];
            }
        }
        wordCount--;
    }

    public void getWord(int i) {
        if (i >= 0 && i < wordCount) {
            System.out.println("[" + i + "]: " + words[i]);
        } else {
            System.out.println("Indeks poza zakresem słownika");
        }
    }

    public boolean isInDictionary(String word) {

        for (int i = 0; i < wordCount; i++) {
            if (words[i].equals(word)) {
                return true;
            }
        }
        return false;
    }

    public String wordsNotInDictionary(String zdanie) {
        String[] words1 = zdanie.split(" ");
        String napis = "";
        for (String e : words1) {
            if (!isInDictionary(e)) {
                napis = napis + e + " ";
            }
        }
        return napis;
    }

    public String wordsAreInDictionary(String zdanie) {
        String[] words1 = zdanie.split(" ");
        String napis = "";
        for (String e : words1) {
            if (isInDictionary(e)) {
                napis = napis + e + " ";
            }
        }
        return napis;
    }

    public Dictionary(String[] words) {
        for (int i = 0; i < words.length; i++) {
            this.words[i] = words[i];
        }
        wordCount = words.length;
    }
}
