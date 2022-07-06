package zadanie7;

public class Mother implements FamilyMember {
    public Mother() {
        System.out.println("i am mother");
    }



    @Override
    public void przedstawSie() {

    }

    @Override
    public boolean jestDorosly() {
        return true;
    }
}
