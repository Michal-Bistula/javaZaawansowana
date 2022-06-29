package projektWarsztat;

public class Kolo {

    private boolean przebite = false; //domyslnie też jest false;
    private double cisnienie = 2.4;

    public Kolo(boolean przebite, double cisnienie) {
        this.przebite = przebite;
        this.cisnienie = cisnienie;
    }

    public void zlapGume() {
        przebite = true;
        cisnienie = 0.0;
    }


}
