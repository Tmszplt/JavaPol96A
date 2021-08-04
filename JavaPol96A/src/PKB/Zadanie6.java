package PKB;

/*
Zadanie 6
	UE w 2021 roku wytworzy PKB = 16 bln EUR. Wytworzy także CO2 równe PKB * 0,01 kg.
	 Ponoć w 2040 roku emisja CO2 w UE ma być mniejsza o 55%. UE zamierza również rosnąć
	  gospodarczo w kategorii PKB o 3% rocznie.
	Pytanie 1: ile wyniesie PKB UE w 2040 roku w bilionach EUR. I ile to
	będzie emisji CO2 bez redukcji emisji.
	Pytanie 2: ile UE będzie emitowało CO2 z redukcją emisji o 55%.
 */
public class Zadanie6 {
    public static void main(String[] args) {
        double pkb2021 = 16;
        double co22021 = 0;
        double pkb2040 = pkb2021;
        co22021 = pkb2021*0.01;

        for( int i = 2022; i <= 2040; i++){
            pkb2040 *= 1.035;
        }
        System.out.println("Emisja CO2 w 2021 roku wynosi " + (pkb2021 * 0.01));
        System.out.println("PKB w 2040 roku wyniesie " + (pkb2040));
        System.out.println("Emisja CO2 w 2040 roku wyniesie " + (pkb2040 * 0.01));
        System.out.println("Emisja CO2 z redukcja  w 2040 roku wyniesie " + (pkb2040 * 0.01 * 0.45));

    }
}

