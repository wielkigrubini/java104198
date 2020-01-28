

// Stwórz klasę People (imię, nazwisko, wiek).
// Utwórz List<People> i wrzuć tam kilka elementów.
//	1) Spraw aby drukujšc wszystkie elementy: linijka System.out.println(person); drukowała dane o osobie w przystepnej formie.
//	2) Pokaż przykład sortowania malejšco wg. wieku za pomocš interfejsu Comparable
//	3) Pokaż przykład sortowania malejšco wg. nazwiska osoby przy użyciu komparatora


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class People {
    String imie;
    String nazwisko;
    int wiek;

    public People(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String person() {
        return "Nazwisko: " + nazwisko + "\nImie: " + imie + "\nWiek: " + wiek + "\n";
    }

    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        list.add(new People("Krzysztof", "Jerzyna", 40));
        list.add(new People("Jan", "Kowalski", 23));
        list.add(new People("Marek", "Nowak", 10));
        list.add(new People("Anna", "Maria", 27));
        list.add(new People("Zofia", "Andrzejczyk", 80));
        list.add(new People("Artur", "Igła", 35));
        list.add(new People("Katarzyna", "Witt", 48));

        for(People el : list)
            System.out.println(el.person());

        System.out.println("Zakończono wypisywanie listy");

        list.sort(Comparator.comparing(a -> a.nazwisko));
        Collections.reverse(list);
        for (People temp: list) {
            System.out.println(temp.person());
        }



    }
}
