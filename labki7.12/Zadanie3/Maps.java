// Przeczytaj artykuł https://kobietydokodu.pl/niezbednik-juniora-kolekcje-w-jezyku-java/,
// a nstępnie wykonaj zadanie.

// Stwórz mapę typu: Map<Integer, Person> gdzie Key=numer PESEL, Value=Person.
// Pokaż jak łatwo z wykorzystaniem Mapy można znajdować osoby po numerach PESEL.
// Zaprezentuj w main korzystnie z tego mechanizmu.

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, Person> map= new HashMap<>();

        for (int i = 1; i < 12; i ++) {
            map.put(991231000 + i, new Person("Marian " + i, "Kowalski"));
        }

        int pesel = 991231003;
        System.out.println("PESEL: " + pesel + "\n\tImie: " + map.get(pesel).getFirstName() + "\n\tNazwisko: " + map.get(pesel).getLastName());

        pesel = 991231010;
        System.out.println("PESEL: " + pesel + "\n\tImie: " + map.get(pesel).getFirstName() + "\n\tNazwisko: " + map.get(pesel).getLastName());


    }

}