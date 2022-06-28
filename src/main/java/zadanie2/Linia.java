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

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setWypelnienie(String wypelnienie) {
        this.wypelnienie = wypelnienie;
    }

    public void setPrzeplot(String przeplot) {
        this.przeplot = przeplot;
    }

    public String getWypelnienie() {
        return wypelnienie;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public String getPrzeplot() {
        return przeplot;
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
