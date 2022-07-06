package zadanie7;

public class Daughter implements FamilyMember{
    public Daughter() {
        System.out.println("i am daughter ;)");
    }

    @Override
    public void przedstawSie() {

    }

    @Override
    public boolean jestDorosly() {
        return false;
    }
}
