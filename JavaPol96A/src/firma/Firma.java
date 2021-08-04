package firma;
/*
Utwórz klasę Firma, w której w prywatnej tablicy 'pracownicy (Pracownik[] pracownicy) przechowywane będą dane dotyczące pracowników firmy.
    Napisz następujące metody:
    - metoda 'add' dodająca pracownika do listy pracowników
    - metoda 'remove' usuwająca pracownika z listy pracowników
    - metoda showAll() wyświetlająca dane wszystkich pracowników
    - metoda show(String imię, String nazwisko) wyświetla dane pracownika o tym imieniu i nazwisko, lub wyświetlająca informację "nie ma takiego pracownika"
    - metoda show(String stanowisko) wyświetlająca wszystkich pracowników o tym stanowisku

    - metoda obliczająca średnią pensję w firmie
    - metoda wyświetlająca dane pracowników o pensji wyższej niż średnia w firmie
    - metoda znajdująca pracownika o najwyższej pensji
    - metoda znajdująca pracownika o pensji najbliższej do średniej pensji w firmie
    - metoda znajdująca stanowisko, które pojawia się najczęściej wśród pracowników firmy
    - metoda znajdująca stanowisko o najwyższej średniej pensji
    - metoda z argumentami: imie i nazwisko i wyświetlająca dane pracownika o tym imieniu i nazwisku (jeśli jest taki) lub wyświetlająca informację, że
      takiego pracownika nie ma
 */
public class Firma {
    private final int maxSize = 1024;
    private int liczbaPracownikow = 0;

    private Pracownik[] pracownicy = new Pracownik[maxSize];

    public int getLiczbaPracownikow() {
        return liczbaPracownikow;
    }

    public void add(Pracownik pracownik) {
        pracownicy[liczbaPracownikow++] = pracownik;
    }

    public void remove(Pracownik pracownik) {
        for (int i = 0; i < liczbaPracownikow; i++) {
            if (pracownicy[i].equals(pracownik)) {
                for (int j = i; j < liczbaPracownikow; j++) {
                    pracownicy[j] = pracownicy[j + 1];
                }
                liczbaPracownikow--;
                break;
            }
        }
    }

    public void showAll() {
        System.out.println("Lista pracowników: ");
        for (int i = 0; i < liczbaPracownikow; i++) {
            System.out.print((i + 1) + ": " );
            System.out.println(pracownicy[i].toString());
        }
    }

    public void show(String imie, String nazwisko) {
        for (int i = 0; i < liczbaPracownikow; i++) {
            if (pracownicy[i].getImie().equals(imie) && pracownicy[i].getNazwisko().equals(nazwisko)) {
                System.out.println(pracownicy[i].toString());
                return;
            }
        }

        System.out.println("Nie ma takiego pracownika");
    }

    public void show(String stanowisko) {
        System.out.printf("Pracownicy na stanowiku %s:%n", stanowisko);
        for (int i = 0; i < liczbaPracownikow; i++) {
            if (pracownicy[i].getStanowisko().equals(stanowisko)) {
                System.out.println(pracownicy[i].toString());
            }
        }
    }

    public double averageSalary() {
        double sum = 0.0;
        for (int i = 0; i < liczbaPracownikow; i++) {
            sum += pracownicy[i].getPensja();
        }

        return sum / liczbaPracownikow;
    }

    public void showEmployeesWithSalaryAboveAverage() {
        double averageSalary = averageSalary();
        System.out.printf("Lista pracowników o pensji większej niż %.2f:%n", averageSalary);
        for (int i = 0; i < liczbaPracownikow; i++) {
            if (pracownicy[i].getPensja() > averageSalary) {
                System.out.println(pracownicy[i].toString());
            }
        }
    }

    public void showEmployeeWitTheHighestSalary() {
        double max = 0.0;
        int index = 0;
        for (int i = 0; i < liczbaPracownikow; i++) {
            if (pracownicy[i].getPensja() > max) {
                max = pracownicy[i].getPensja();
                index = i;
            }
        }
        System.out.println("Pracownik o najwyższej pensji.");
        System.out.println(pracownicy[index]);
    }

    public void showEmployeeWithTheClosestSalaryToAverage() {
        double averageSalary = averageSalary();
        double minDifference = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < liczbaPracownikow; i++) {
            double difference = Math.abs(pracownicy[i].getPensja() - averageSalary);
            if (difference < minDifference) {
                minDifference = difference;
                index = i;
            }
        }
        System.out.println("Pracownik zarbiający najbliżej średniej pensji to: ");
        System.out.println(pracownicy[index].toString());
    }

    public int numberOfEmployeesOnThePosition(String position) {
        int count = 0;
        for (int i = 0; i < liczbaPracownikow; i++) {
            if (pracownicy[i].getStanowisko().equals(position)) {
                count++;
            }
        }
        return count;
    }

    public String theMostPopularPosition() {
        Positions[] posiotions = new Positions[20000];
        posiotions[0] = new Positions();
        posiotions[0].position = pracownicy[0].getStanowisko();
        posiotions[0].numberOfEmployees = 1;

        int numberOfPositions = 1;
        for (int i = 1; i < liczbaPracownikow; i++) {
            boolean isFound = false;
            for (int j = 0; j < numberOfPositions; j++) {
                if (posiotions[j].position.equals(pracownicy[i].getStanowisko())) {
                    posiotions[j].numberOfEmployees++;
                    isFound = true;
                }
            }
            if (isFound == false) {
                posiotions[numberOfPositions] = new Positions();
                posiotions[numberOfPositions].position = pracownicy[i].getStanowisko();
                posiotions[numberOfPositions].numberOfEmployees = 1;
                numberOfPositions++;
            }
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < numberOfPositions; i++) {
            if (posiotions[i].numberOfEmployees > max) {
                max = posiotions[i].numberOfEmployees;
                index = i;
            }
        }

        return posiotions[index].position;
    }
}

class Positions {
    String position;
    int numberOfEmployees;

}
