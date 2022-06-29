package projektDom;

import java.util.Arrays;

public class Dom {
    private final Pokoj[] pokoje;

    public Dom(Pokoj[] pokoje) {
        this.pokoje = pokoje;
    }

    public void posprzataj() {
        for (Pokoj pokoj : pokoje) {
            pokoj.posprzataj();
        }
    }

    @Override
    public String toString() {
        return "Dom{" +
                "pokoje=" + Arrays.toString(pokoje) +
                '}';
    }
}
