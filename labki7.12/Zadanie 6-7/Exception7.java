//Zadanie 7:
//
//        Stwórz własne dwa wyjątki:
//
//        1) dziedziczący po Exception,
//        2) dziedziczący po RuntimeException.
//        Zaprezentuj jego działanie i obsługę jego w kodzie na podstawie własnego przykładu.


public class Exception7 {

    public static class  MyException extends Exception {
        public MyException() {
            super("Stworzony przez Ciebie dziedzic Exception");
        }
    }

    public static class MyRuntimeException extends RuntimeException {
        public MyRuntimeException() {
            super("Stworzone przez Ciebie dziecko RuntimeException");
        }
    }

    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException ex) {
            System.out.println("Napotkano problem: " + ex.getMessage());
        }
        System.out.println("Zażegnaliśmy problem Twojego Exception");
        try {
            throw new MyRuntimeException();
        } catch (MyRuntimeException ex) {
            System.out.println("Kolejnym problemem jest: " + ex.getMessage());
        } finally {
            System.out.println("Ale ostatecznie został pokonany. <3");
        }
        System.out.println("To by było na tyle");
    }


}
