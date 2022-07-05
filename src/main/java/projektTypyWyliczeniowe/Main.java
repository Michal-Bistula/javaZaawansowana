package projektTypyWyliczeniowe;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Card card2 = new Card(Rank.Krol, Suit.karo);
        Card card1 = new Card(Rank.Dama, Suit.pik);

        System.out.println("Wypisuje dwie stworzone karty");
        System.out.println(card1);
        System.out.println(card2);

        Rank[] rank = Rank.values();

        System.out.println("Typist rangi");
        for (Rank ranks : rank) {
            System.out.println(ranks);
        }


        ArrayList<String> pikList = new ArrayList<>();


        for (Rank ranks : rank) {
            //pikList.add(ard(ranks, Suit.pik));

        }
    }
}
