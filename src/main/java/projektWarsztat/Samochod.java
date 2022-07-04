package projektWarsztat;

import java.util.Arrays;
import java.util.Random;

public class Samochod {
    private Kolo[] kola;

    public Samochod(Kolo[] kola) {
        this.kola = kola;
    }

    public void przebicieOpony() {
        Random random1 = new Random();
        Random random2 = new Random();

        int ileKol = random1.nextInt(kola.length + 1);
        int nrKola = random2.nextInt(kola.length);

        for (int i = 0; i < ileKol; i++) {
            for (int j = 0; j < nrKola; j++) { //niestety może wylosować kilka razy to samo koło
                kola[nrKola].setCisnienie(0.0);
                kola[nrKola].setPrzebite(true);
            }
        }
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "kola=" + Arrays.toString(kola) +
                '}';
    }
}
