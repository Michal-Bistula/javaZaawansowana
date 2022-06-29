package projektDom;

import java.util.Arrays;

public class Pokoj {
    private final Lozko bed;
    private final Okno[] okna;


    public Pokoj(Lozko bed, Okno[] okna) {
        this.bed = bed;
        this.okna = okna;
    }

    public Pokoj() {
        bed = new Lozko(5);
        okna = new Okno[2];
        okna[0] = new Okno();
        okna[1] = new Okno();

    }

    public void tidy(){
        bed.clean();
        for (Okno okno : okna) {
            okno.doOpen();
        }

    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "bed=" + bed +
                ", okna=" + Arrays.toString(okna) +
                '}';
    }
}
