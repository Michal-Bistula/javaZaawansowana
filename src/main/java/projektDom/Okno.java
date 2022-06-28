package projektDom;

public class Okno {

    private boolean open = false;

    public boolean isOpen() {
        return open;
    }

    public void doOpen() {
        open = true;
    }

    @Override
    public String toString() {
        return "Okno{" +
                "open=" + open +
                '}';
    }
}
