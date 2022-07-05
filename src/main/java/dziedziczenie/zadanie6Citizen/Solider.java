package dziedziczenie.zadanie6Citizen;

public class Solider extends Citizen {

    public Solider(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
