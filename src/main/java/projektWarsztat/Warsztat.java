package projektWarsztat;

import java.util.Arrays;

public class Warsztat {

    private Samochod samochod;
    private Kolo[] kolo;


   //

    public Warsztat() {
    }


    public int naprawKola(Kolo[] kolo) {
    int ileNapraw = 0;
        System.out.println("tu początek naprawKola");
        for (int i = 0; i < kolo.length; i++) {
            if (kolo[i].isPrzebite() || kolo[i].getCisnienie() == 0.0) {
                kolo[i].setPrzebite(false);
                kolo[i].setCisnienie(2.4);
                ileNapraw++;
            }
        }
        System.out.println("było tyle napraw " + ileNapraw);
        return ileNapraw;
    }

    @Override
    public String toString() {
        return "Warsztat{" +
                "samochod=" + samochod +
                ", kolo=" + Arrays.toString(kolo) +
                '}';
    }

}
