package projektDom;

import java.util.Arrays;

public class Pokoj {
    private final Lozko lozko;
    private final Okno[] okna;

    //1 konstruktor
    public Pokoj(Lozko lozko, Okno[] okna) {
        this.lozko = lozko;
        this.okna = okna;
    }

    //drugi konstruktor
    public Pokoj() {
        lozko = new Lozko(5);
        okna = new Okno[2];
        okna[0] = new Okno();
        okna[1] = new Okno();

    }

    public void posprzataj() {
        lozko.czysc();
        for (Okno okno : okna) {
            okno.otworz();
        }

    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "lozko=" + lozko +
                ", okna=" + Arrays.toString(okna) +
                '}';
    }
}
