package projektWarsztat;

public class Kolo {

    private boolean przebite; //domyslnie też jest false;
    private double cisnienie = 2.4;

    public Kolo(boolean przebite, double cisnienie) {
        this.przebite = przebite;
        this.cisnienie = cisnienie;
    }

    public void setPrzebite(boolean przebite) {
        this.przebite = przebite;
    }

    public void setCisnienie(double cisnienie) {
        this.cisnienie = cisnienie;
    }

    public boolean isPrzebite() {
        return przebite;
    }

    public double getCisnienie() {
        return cisnienie;
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "przebite=" + przebite +
                ", cisnienie=" + cisnienie +
                '}';
    }
}

