package zadanie7;

public class Son implements FamilyMember {


    public Son() {
        System.out.println("who's asking?");
    }

    @Override
    public void przedstawSie() {

    }

    @Override
    public boolean jestDorosly() {
        return false;
    }
}
