public class Skeleton extends Boss {
    private int numberOfArrows;

    public int getNumbersOfArrows() {
        return numberOfArrows;
    }

    public void setNumbersOfArrows(int numbersOfArrows) {
        this.numberOfArrows = numbersOfArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " NUMBER OF ARROWS: " + numberOfArrows;
    }
}
