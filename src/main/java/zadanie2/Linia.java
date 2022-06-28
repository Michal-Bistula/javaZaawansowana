package zadanie2;

public class Linia {
    private int dlugosc;
    private String wypelnienie;
    private String przeplot;

    public Linia(int dlugosc, String wypelnienie) {
        this.dlugosc = dlugosc;
        this.wypelnienie = wypelnienie;
    }

    public Linia(int dlugosc, String wypelnienie, String przeplot) {
        this.dlugosc = dlugosc;
        this.wypelnienie = wypelnienie;
        this.przeplot = przeplot;
    }

    public void setWypelnienie(String wypelnienie) {
        this.wypelnienie = wypelnienie;
    }

    public String getWypelnienie() {
        return wypelnienie;
    }

    void drukujLinie() {
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(wypelnienie);
        }
        System.out.println();
        // System.out.println(String.valueOf(wypelnienie).repeat(dlugosc));  //ciekawe, krótsze rozwiązanie
    }

    void drukujLiniePrzeplot() {
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(wypelnienie + przeplot);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Linia{" +
                "dlugosc=" + dlugosc +
                ", wypelnienie='" + wypelnienie + '\'' +
                ", przeplot='" + przeplot + '\'' +
                '}';
    }
}
