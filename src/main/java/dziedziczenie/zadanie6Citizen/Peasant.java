package dziedziczenie.zadanie6Citizen;

public class Peasant extends Citizen {

    public Peasant(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
