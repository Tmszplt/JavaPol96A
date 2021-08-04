package winda;

public class Lift {
    /*37. Winda sterowana przez windziarza.
        W budynu jest N pięter i winda. Winda porusza się w górę (up) lub w dół (down).
        Jak winda staje na danym piętrze, to z windy wysiadają
        pasażerowie, którzy zamierzali wysiąść na tym piętrze.
        Następnie windziarz ładuje pasażerów (load 3, 1 -> 5, 2-> 7, 3-> 0).
        Następnie windziarz decyduje czy jechać do góry (up) lub w dół (down).
        Jeśli windziarz zadecyduje, żeby jechać do góry a jesteśmy na
        ostatnim piętrze, to powinien pokazać się odpowiedni komunikat i winda czeka na polecenie.
        Jeśli winda jest na poziomie 0 a windziarz zadecydował, żeby jechać w dół,
        to pojawia się odpowiedni komunikat i winda czeka na polecenie.*/

    private int floorNumber;
    private int levels;
    int[] passengers;
    private int passengersCount;


    public Lift(int levels) {
        this.levels = levels;
        passengers = new int[1000];
        passengersCount = 0;
    }

    public void addPassenger(int level) {
        passengers[passengersCount] = level;
        passengersCount++;
    }

    public void up() {
        if (floorNumber < levels) {
            floorNumber++;
            System.out.println("winda jedzie do góry");
        }

        else System.out.println("winda wyżej nie pojedzie");
    }

    public void down() {
        if (floorNumber > 0) {
            floorNumber--;
            System.out.println("winda jedzie w dół");
        }
        else System.out.println("winda nieżej nie pojedzie");
    }

    public void stop() {
        System.out.println("winda staje na piętrze " + floorNumber);
        for (int i = 0; i < passengersCount; i++) {
            if (passengers[i] == floorNumber) {
                System.out.println("pasażer wysiada");
                passengers[i] = -1;
            }
        }
    }

    public void list() {
        for (int i = 0; i < passengersCount; i++) {
            if (passengers[i] != -1) {
                System.out.print(passengers [i] + " ");
            }
        }
        System.out.println();
    }
}