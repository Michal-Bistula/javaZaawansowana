package projektDom;

public class Lozko {

    private int cleanLine;

    public Lozko(int cleanLine) {
        this.cleanLine = cleanLine;
    }

    public void clean() {
        cleanLine = 0;
    }


    @Override
    public String toString() {
        return "Lozko{" +
                "cleanLine=" + cleanLine +
                '}';
    }
}


