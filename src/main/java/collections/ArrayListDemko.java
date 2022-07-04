package collections;

import java.util.ArrayList;

public class ArrayListDemko {

    public static void main(String[] args) {

        ArrayList<String> samochody = new ArrayList<>();
        System.out.println(samochody.isEmpty());

        samochody.add("Volvo");
        samochody.add("Kia");
        samochody.add("BMW");
        samochody.add("Ford");

        System.out.println(samochody);

        samochody.add(3, "Jaguar");
        System.out.println(samochody);

        samochody.remove(2);
        System.out.println(samochody);

        System.out.println(samochody.isEmpty());

        System.out.println(samochody.clone());

        System.out.println(samochody.get(1));


        samochody.clear();
        System.out.println(samochody);




        ArrayList<Integer> liczby = new ArrayList<>();
        System.out.println(samochody.isEmpty());

        liczby.add(5);
        liczby.add(10);
        liczby.add(15);
        liczby.add(20);

        System.out.println(liczby);

        liczby.add(3, 18);
        System.out.println(samochody);

        liczby.remove(2);
        System.out.println(liczby);

        System.out.println(liczby.isEmpty());

        System.out.println(liczby.clone());

        System.out.println(liczby.get(1));
        System.out.println(liczby.size());
        liczby.clear();
        System.out.println(liczby);





    }
}
