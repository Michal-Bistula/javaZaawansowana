package zadanie1;

public class Samochod {
    String marka;
    int przebieg;
    int przeglad;

    public Samochod(String marka, int przebieg, int przeglad) {
        this.marka = marka;
        this.przebieg = przebieg;
        this.przeglad = przeglad;
    }

    public Samochod(String marka, int przebieg) {
        this.marka = marka;
        this.przebieg = przebieg;
    }

    void viewMark() {
        System.out.println("marka: " + marka + ", przebieg: " + przebieg);
    }

    void odleglosc(int odleglosc) {

        System.out.println("Nowy przebieg " + (przebieg += odleglosc) + " km");
    }

    void iloscKilometrow() {
        System.out.println("Przegląd za: " + (przeglad - przebieg) + " km");
    }
}
