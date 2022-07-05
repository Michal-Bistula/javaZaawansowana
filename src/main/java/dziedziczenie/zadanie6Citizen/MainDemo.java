package dziedziczenie.zadanie6Citizen;

public class MainDemo {
    public static void main(String[] args) {

        King king = new King("Mieszko I");
        Peasant peasant = new Peasant("Stachu");
        Solider solider = new Solider("Forest");
        Townsman townsman = new Townsman("Qba");

        Town town = new Town();
        town.add(king);
        town.add(peasant);
        town.add(solider);
        town.add(townsman);

        System.out.println(town);
        System.out.println(town.howManyCanVote());
        town.whoCanVote();

    }
}
