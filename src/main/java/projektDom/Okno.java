package projektDom;

public class Okno {

    private boolean otwarte = false;

    public boolean czyOtwarte() {
        return otwarte;
    }

    public void otworz() {
        otwarte = true;
    }

    @Override
    public String toString() {
        return "Okno{" +
                "otwarte=" + otwarte +
                '}';
    }
}
