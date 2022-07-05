package projektZwierzetaDziedziczenie;

import projektWarsztat.Samochod;

public class Pies extends Animal{

    private String name;
    private int waga;

    public void dzwiek() {
        System.out.println("hau hau");
    }

    public void aportuj() {
        System.out.println("aportuje");
    }

    public void spij(){
        System.out.println("spij");
    }

    @Override
    public void uciekaj() {
        super.uciekaj();
    }
}
