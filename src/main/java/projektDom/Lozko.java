package projektDom;

public class Lozko {

    private int czystaPosciel;

    public Lozko(int ileDni) {
        this.czystaPosciel = ileDni;
    }

    public void czysc() {
        czystaPosciel = 0;
    }

    @Override
    public String toString() {
        return "Lozko{" +
                "czystaPosciel=" + czystaPosciel +
                '}';
    }
}


