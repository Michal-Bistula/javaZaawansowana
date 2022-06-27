package zadanie1;

public class SamochodDemo {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Volvo", 15000, 20000);
        Samochod samochod2 = new Samochod("Skoda", 50000, 60000);
        Samochod samochod3 = new Samochod("Fiat", 30000);

//        samochod1.marka = "Volvo";
//        samochod1.przebieg = 15_000;
//        samochod1.przeglad = 20_000;

//        samochod2.marka = "Skoda";
//        samochod2.przebieg = 50_000;
//        samochod2.przeglad = 60_000;

        samochod1.viewMark();
        samochod1.odleglosc(20);
        samochod1.iloscKilometrow();

        samochod2.viewMark();
        samochod2.odleglosc(21);
        samochod2.iloscKilometrow();

        samochod3.viewMark();
        samochod3.odleglosc(23);
    }
}