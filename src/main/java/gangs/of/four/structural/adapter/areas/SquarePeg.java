package gangs.of.four.structural.adapter.areas;

public class SquarePeg {
    private double width;

    public SquarePeg(double width){
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare(double width) {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
