package projektTypyWyliczeniowe;

public enum Rank {
    Dziewiatka(9),
    Dziesiatka(10),
    Walet(11),
    Dama(12),
    Krol(13),
    As(14);


private int numberForce;

    Rank(int numberForce){
        this.numberForce = numberForce;
    }


    public int getNumberForce() {
        return numberForce;
    }




    @Override
    public String toString() {
        return "Rank{" +
                "numberForce=" + numberForce +
                '}';
    }

}
