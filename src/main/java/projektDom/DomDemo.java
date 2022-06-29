package projektDom;

import java.util.Arrays;

public class DomDemo {
    public static void main(String[] args) {

        Okno okno = new Okno();
        okno.doOpen();
        System.out.println(okno);

        Okno[] okna = new Okno[4];
        okna[0] = new Okno(); //tutaj są 4 obiekty towrzone
        okna[1] = new Okno();
        okna[2] = new Okno();
        okna[3] = new Okno();

        for (Okno aOkno : okna) {
            aOkno.doOpen();
        }
        System.out.println(Arrays.toString(okna));


        Lozko bed = new Lozko(4);
        bed.clean();
        System.out.println(bed);


        Pokoj room = new Pokoj();
        Pokoj room2 = new Pokoj(bed, okna);

        System.out.println(room);
        System.out.println(room2);

        //dom
        Pokoj[] rooms = {room, room2};
        Dom dom = new Dom(rooms);
        dom.tidy();
        System.out.println(dom);

    }
}
