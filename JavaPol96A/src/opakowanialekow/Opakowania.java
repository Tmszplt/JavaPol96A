package opakowanialekow;
import java.util.*;

public class Opakowania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L1 = 0;
        int L2 = 0;
        int L3 = 0;
        System.out.print("Podaj ile tabletek mieści się w pierwszym opakowaniu: ");
        L1 = scanner.nextInt();
        System.out.print("Podaj ile tabletek mieści się w drugim opakowaniu: ");
        L2 = scanner.nextInt();
        System.out.print("Podaj ile tabletek mieści się w trzecim opakowaniu: ");
        L3 = scanner.nextInt();
        int dniSuma=0;
        boolean koniec=false;
        System.out.println("Podaj ile tabletek jest aktualnie w opakowaniu pierwszym: ");
        int opakowanieL1= scanner.nextInt();
        System.out.println("Podaj ile tabletek jest aktualnie w opakowaniu drugim: ");
        int opakowanieL2=scanner.nextInt();
        System.out.println("Podaj ile tabletek jest aktualnie w opakowaniu trzecim: ");
        int opakowanieL3=scanner.nextInt();
        do {
            if (opakowanieL1==0 && opakowanieL2 == 0 && opakowanieL3 == 0) {
                koniec=true;
                break;
            }
            if (opakowanieL1 == 0 ) opakowanieL1 = L1;
            if (opakowanieL2 == 0 ) opakowanieL2 = L2;
            if (opakowanieL3 == 0 ) opakowanieL3 = L3;
            dniSuma ++;
            if (dniSuma > 100_000)
                break;
            opakowanieL1--;
            System.out.print(" L1: "+opakowanieL1);
            opakowanieL2--;
            System.out.print(" L2: "+opakowanieL2);
            opakowanieL3--;
            System.out.print(" L3: "+opakowanieL3);
            System.out.println();
        } while (!koniec);
        if (koniec == true)
            System.out.println("Wszystkie opakowania jednocześnie skończą się po: "+ dniSuma+" dni");
        else
            System.out.println("Chyba nigdy nie nastąpi jednoczesne skończenie się tabletek!");
    }
}
