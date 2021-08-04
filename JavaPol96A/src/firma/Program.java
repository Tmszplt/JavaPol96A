package firma;

public class Program {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Stefan", "Kowlaski", "mechanik", 1234.78);
        Pracownik pracownik2 = new Pracownik("Mikołaj", "Nowak", "księgowy", 2547.10);
        Pracownik pracownik3 = new Pracownik("Monika", "Duda", "mechanik", 1500.45);
        Pracownik pracownik4 = new Pracownik("Kasia", "Saska", "mechanik", 1500.45);
        Pracownik pracownik5 = new Pracownik("Stefan", "Ochucki", "kasjer", 2000.12);

        Firma company = new Firma();
        company.add(pracownik1);
        company.add(pracownik2);
        company.add(pracownik3);
        company.add(pracownik4);
        company.add(pracownik5);

//        company.showAll();
//        company.remove(pracownik3);
//        company.showAll();

//        company.show("Stefan", "Kowlaski");
//        company.show("Stefano", "Terazzino");

//        company.show("mechanik");

        System.out.println("Średnia pensja: " + company.averageSalary());
//        company.showEmployeesWithSalaryAboveAverage();

//        company.showEmployeeWitTheHighestSalary();
//        company.showEmployeeWithTheClosestSalaryToAverage();

        System.out.println("Najpopularniejsze stanowiko w firmie: " + company.theMostPopularPosition());

    }
}
