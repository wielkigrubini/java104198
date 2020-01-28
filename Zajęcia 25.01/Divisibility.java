
// Utwórz klasę dziedziczšcš po Thread, której zadaniem jest wypisanie wszystkich liczb
// podzielnych przez 3 z zakresu liczb od X do Y.
// Utwórz kod, który wystartuje równolegle 5 wštków,
// gdzie każdy z wštków wypisze owe liczby na ekran w zakresach liczb odpowiednio 0-100,  101-200, 201-300 ...



public class Divisibility extends Thread {

    private int start, end;

    public Divisibility(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++)
            if(i%3 == 0)
                System.out.println(i);
    }

    public static void main(String[] args) {
        Divisibility d1 = new Divisibility(0,100);
        Divisibility d2 = new Divisibility(101,200);
        Divisibility d3 = new Divisibility(201,300);
        Divisibility d4 = new Divisibility(301,400);
        Divisibility d5 = new Divisibility(401,500);

        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();
    }

}
