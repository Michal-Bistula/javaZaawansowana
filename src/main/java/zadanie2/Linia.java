package zadanie2;

public class Linia {
    int dlugosc;
    String wypelnienie;
    String przeplot;

    public Linia(int dlugosc, String wypelnienie) {
        this.dlugosc = dlugosc;
        this.wypelnienie = wypelnienie;
    }

    public Linia(int dlugosc, String wypelnienie, String przeplot) {
        this.dlugosc = dlugosc;
        this.wypelnienie = wypelnienie;
        this.przeplot = przeplot;
    }

    void drukujLinie() {
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(wypelnienie);
        }
        System.out.println();
        //  System.out.println(String.valueOf(wypelnienie).repeat(dlugosc));  //ciekawe, krótsze rozwiązanie
    }

    void drukujLiniePrzeplot() {
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(wypelnienie + przeplot);
        }
        System.out.println();
    }
}
