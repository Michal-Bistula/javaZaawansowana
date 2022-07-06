package zadanie7;

public class Father implements FamilyMember {
    public Father() {
        System.out.println("i am your father");
    }

    @Override
    public void przedstawSie() {

    }

    @Override
    public boolean jestDorosly() {
        return true;
    }
}
