package zadanie2;

public class LiniaDemo {
    public static void main(String[] args) {
        Linia linia1 = new Linia(20, "*");
        Linia linia2 = new Linia(15, "O");
        Linia linia3 = new Linia(17, "Y");
        Linia linia4 = new Linia(18, "^", "#");

//        linia1.dlugosc = 20;
//        linia1.wypelnienie = "++";
//
//        linia2.dlugosc = 30;
//        linia2.wypelnienie = "**";
//
//        linia3.dlugosc = 10;
//        linia3.wypelnienie = "OO";

        linia1.drukujLinie();
        linia2.drukujLinie();
        linia3.drukujLinie();
        linia4.drukujLiniePrzeplot();
    }
}
