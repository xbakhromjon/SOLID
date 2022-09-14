package uz.bakhromjon;

public class Square implements AreableShape {
    private double side;

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
