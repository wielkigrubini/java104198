public class Zadanie {

    public static void main(String[] args) {
        Figure f = new Figure(2, false);
        Square s = new Square(4);
        f.printSidesNumber();
        s.printSidesNumber();
        System.out.println("Area of this sqare equals " + s.getArea());
        s.resetAllAttributes();
        System.out.println("Area of this sqare equals " + s.getArea());
    }

}
