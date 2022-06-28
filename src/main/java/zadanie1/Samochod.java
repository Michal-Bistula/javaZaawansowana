package zadanie1;

public class Samochod {
    private String marka;
    private int przebieg;
    private int przeglad;


    public int getPrzebieg() {
        return przebieg;
    }


    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }


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

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", przebieg=" + przebieg +
                ", przeglad=" + przeglad +
                '}';
    }
}
