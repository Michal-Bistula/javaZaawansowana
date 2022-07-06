package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int readNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
            System.out.println("Podano " + number);
        }catch (InputMismatchException e){
            System.out.println("Błąd. Wpisz liczbę");
            return this.readNumber();
        }
        return number;
    }


    public static void main(String[] args) {
        Input input = new Input();
        //System.out.println("podano "+ input.readNumber());
input.readNumber();



    }

}
