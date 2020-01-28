// Wykorzystaj wiedzę na temat metody join() i stwórz następującą funkcjonalność:

//1. Stwórz w pętli FOR kolejnych 10 wątków, które drukują na ekran liczby od 1 do 20.
//2. Niech odpalenie kolejnego wątku będzie uruchamiane po tym jak poprzedni wątek zakończy pracę.
//3. Zastosuj metodę join() aby uzyskać żądany efekt.

public class JoinPractice {

    public static class MyThread extends Thread {

        @Override
        public void run(){
            for (int i = 1; i < 20; i++)
                System.out.print(i + ", ");
            System.out.print("20\n");
        }

    }

    public static void main(String[] args) {
        MyThread array[] = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            array[i] = new MyThread();
            array[i].start();

            try {
                array[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
