package operacjeTablice;

public class program {
    public static void main(String[] args) {

        int[] tab = new int[] { 1,2,5,8,9,11,55,-5,-11,8,4,-2,0,4,-4};

        Tablice tablica = new Tablice(tab);

        tablica.pokazTablicę();
        tablica.zamiana();
        tablica.pokazTablicę();
        tablica.zaUjemną0();
        tablica.pokazTablicę();

    }
}
