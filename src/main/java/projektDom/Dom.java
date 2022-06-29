package projektDom;

import java.util.Arrays;

public class Dom {
    private final Pokoj[] rooms;

    public Dom(Pokoj[] rooms) {
        this.rooms = rooms;
    }

    public void tidy() {
        for (Pokoj room : rooms) {
            room.tidy();
        }
    }

    @Override
    public String toString() {
        return "Dom{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
