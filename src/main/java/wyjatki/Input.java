package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int readNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        try {
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Błąd. Wpisz liczbę");
            return readNumber();
        }finally{
            System.out.println("konic bloku pobierania");
        }
    }


    public static void main(String[] args) {
        Input input = new Input();
        //System.out.println("podano "+ input.readNumber());
        input.readNumber();



    }

}
