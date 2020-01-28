public class Quadruple<L,M,R,F> extends Triple<L,M,R> {

    private F fourth;

    protected Quadruple(L left, M middle, R right, F fourth) {
        super(left, middle, right);
        this.fourth = fourth;
    }

    public F getFourth() {
        return fourth;
    }

    public void setFourth(F fourth) {
        this.fourth = fourth;
    }

    public static void main(String[] args) {
        Triple<String, Double, Integer> quad = new Quadruple<>("Programowanie", 0.75, 123, "Java");
        System.out.println("left: " + quad.getMiddle());

    }
}
