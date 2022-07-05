package projektZwierzetaDziedziczenie;
//dokończyć
public class MainDemo {
    public static void main(String[] args) {
        Pies pies = new Pies();
        Kot kot = new Kot();

        pies.aportuj();
        pies.dzwiek();
        pies.uciekaj();

        kot.lapMysz();
        kot.dzwiek();
        kot.uciekaj();

    }
}
