public class Square extends Figure implements Resetable {

    private double sideLength;
    private double area;

    public Square(double sideLength) {
        super(4, true);
        setSideLength(sideLength);
        System.out.println("Square creating - done!");
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
        area = this.sideLength * this.sideLength;
    }

    public double getArea() {
        return area;
    }

    @Override
    public void resetAllAttributes() {
        System.out.println("Reseting values of your square...");
        setSideLength(0);
    }

    @Override
    public void printSidesNumber() {
        super.printSidesNumber();
        System.out.println("It's a square! :)");
    }
}
