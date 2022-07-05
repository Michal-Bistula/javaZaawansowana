package dziedziczenie.zadanie6Citizen;

public class Townsman extends Citizen {
    public Townsman(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
