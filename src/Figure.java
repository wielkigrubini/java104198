public class Figure implements NumberOfSidesPrintable {

    private int numberOfVertex;
    private int numberOfSides;
    private boolean isConvex;

    public Figure(int numberOfVertex, boolean isConvex) {
        if (numberOfVertex <= 2) {
            System.out.println("That has to be a mistake. I'm sure that You know, that there's no figure with less than 3 vertex. \nI guess that's just a mistake and I'm setting it to 3 for You. ;)");
            numberOfVertex = 3;
        }

        this.numberOfVertex = numberOfVertex;
        this.numberOfSides = numberOfVertex;
        this.isConvex = isConvex;
    }

    @Override
    public void printSidesNumber() {
        System.out.println("Your figure has " + this.numberOfSides + " sides.");
    }
}
