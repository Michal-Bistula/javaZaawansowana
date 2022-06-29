package projektDom;

import java.util.Arrays;

public class DomDemo {
    public static void main(String[] args) {

        Okno okno = new Okno();
        okno.otworz();
        System.out.println("Stworzył okno (domyślnie zamknięte): " + okno);

        Okno[] okna = new Okno[4];
        okna[0] = new Okno(); //tutaj są 4 obiekty towrzone
        okna[1] = new Okno();
        okna[2] = new Okno();
        okna[3] = new Okno();

        //otwieranie okien
        for (Okno o : okna) {
            o.otworz();
        }
        System.out.println("Stworzył 4 okna i je otworzyl: " + Arrays.toString(okna));


        Lozko lozko = new Lozko(4);
        System.out.println("Nowe lóżko: " + lozko);

        lozko.czysc();
        System.out.println("Czyści łóżko: " + lozko);

        Pokoj pokoj1 = new Pokoj();
        Pokoj pokoj2 = new Pokoj(lozko, okna);

        System.out.println("Tworzy pokój:" + pokoj1);
        System.out.println("Towrzy pokój z łóżkiem i okno: " + pokoj2);

        //tworzy dom
        Pokoj[] pokoje = {pokoj1, pokoj2};
        Dom dom = new Dom(pokoje);
        dom.posprzataj();
        System.out.println("Stworzył dom: " + dom);

    }
}
