package wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileConnection {

    public void wyswietlKsiazki() {
        File file = new File("src/main/java/wyjatki");
        try {
            Scanner scanner = new Scanner(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
