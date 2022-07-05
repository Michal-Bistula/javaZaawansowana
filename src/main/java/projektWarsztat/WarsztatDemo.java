package projektWarsztat;
//dokończyć
public class WarsztatDemo {
    public static void main(String[] args) {

        Kolo[] kolo = new Kolo[4];
        for (int i = 0; i < kolo.length; i++) {
            kolo[i] = new Kolo(false, 2.4);
        }

        Samochod samochod = new Samochod(kolo);
        System.out.println(samochod);

        samochod.przebicieOpony();
        System.out.println(samochod);

        Warsztat warsztat = new Warsztat();
        warsztat.naprawKola(kolo);
        System.out.println(warsztat.naprawKola(kolo));
        //System.out.println(samochod);

        //Paragon paragon = new Paragon();
        //paragon.policzZaUsluge(kolo);
    }
}
