package liczymyCzas;

public class Program {
    public static void main(String[] args) {
        Display display = new Display(23,56,23);
        String time = display.toString();
        System.out.println(time);
        // dodajemy sekundy
        display.plusSeconds(234);
        time = display.toString();
        System.out.println(time);
        //dodajemy minuty
        display.plusMinutes(2);
        time = display.toString();
        System.out.println(time);
        // odejmujemy sekundy
        display.minusSeconds(237 + 120);
        time = display.toString();
        System.out.println(time);
        display.minusSeconds(25);
        time = display.toString();
        System.out.println(time);
        display.minusSeconds(56*60);
        time = display.toString();
        System.out.println(time);

    }
}
