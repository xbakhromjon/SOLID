package uz.bakhromjon;

public class Cube implements AreableShape, ThreeDimensionalShape {
    private double side;

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
