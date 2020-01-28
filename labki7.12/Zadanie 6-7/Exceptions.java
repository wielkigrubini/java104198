//Zadanie 6:

//        2) Sprawdź różne konfiguracje i kolejności klauzuli catch.
//        Które z nich są prawidłowe a których java nie pozwoli nam napisać.
//
//        3) Napisz kod rzucający błędem dziedziczącym po RuntimeException
//        (np. NullPointerException lub inny) a następnie podaj przykład jego obsługi.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {

///////////////////////////////////////////////////////////////////////////////
//        Sprawdź jak zachowują się wyjątki
//        1) Stwórz sytuację gdzie rzucane są dwa wyjątki gdzie jeden dziedziczy po drugim:
//        np. przekopiowując kod z laboratorium.
///////////////////////////////////////////////////////////////////////////////


//    public static void main(String[] args) throws IOException {
//        new Exceptions().readFile();
//    }
//
//    public void readFile() throws IOException {
//        FileReader fr = new FileReader("E://file.txt");
//        char[] a = new char[50];
//        fr.read(a);
//        // wczytaj 50 znaków
//        for (char c : a) {
//            System.out.print(c);
//            // drukuje znak po znaku
//        }
//    }

//         WNIOSEK: W Javie nie jest możliwe "rozdzielenie" dziedziczących po sobie wyjątków tak, by metoda wyrzucałą zarówno rodzica, jak i dziecko.
//                  W przypadku takich wyjątków zastępowane są one tym bardziej ogólnym.


///////////////////////////////////////////////////////////////////////////////
//     2) Sprawdź różne konfiguracje i kolejności klauzuli catch.
//        Które z nich są prawidłowe a których java nie pozwoli nam napisać.
///////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) throws IOException {
//        try {
//            new Exceptions().readFile();
//            System.out.println("TO JEST TEXT");
//        } catch (IOException e) {
//            System.out.println("Brak pliku. Powód: " + e.getMessage());
//        } catch (FileNotFoundException e) {
//            System.out.println("Problem ogólny WE/WY. Powód: " +
//                    e.getMessage());
//        }
//    }
//
//    public void readFile() throws IOException {
//        FileReader fr = new FileReader("E://file.txt");
//        char[] a = new char[50];
//        fr.read(a);
//        // wczytaj 50 znaków
//        for (char c : a) {
//            System.out.print(c);
//            // drukuje znak po znaku
//        }
//    }

//         WNIOSEK: Java nie pozwala ustawić konfigruacji w taki sposób, bo błąd dziedziczący znalazłby się "za" błędem rodzicem ("exception <name> has been already caught").


///////////////////////////////////////////////////////////////////////////////
//     3) Napisz kod rzucający błędem dziedziczącym po RuntimeException
//        (np. NullPointerException lub inny) a następnie podaj przykład jego obsługi.
///////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        String[] txt = {"informatyka", "zaoczna"};
        try {
            System.out.println(txt[2]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Nie ma takiego numeru...");
            System.out.println("Przyczyna: " + ex.getMessage());
        }
        System.out.println("Wypisze zatem to co mam: ");
        for (String el : txt)
            System.out.printf(el + " ");
    }
}