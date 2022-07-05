package projektZwierzetaDziedziczenie;

public class Kot extends Animal{

    private String name;
    private int waga;

    public void dzwiek() {
        System.out.println("miau miau");
    }

    public void lapMysz() {
        System.out.println("łapie mysz");
    }

    public void spij(){
        System.out.println("spij");
    }

    @Override
    public void uciekaj() {
        super.uciekaj();
        System.out.println("na drzewo");
    }
}
