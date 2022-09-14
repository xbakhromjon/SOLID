package uz.bakhromjon;

public class NoAreableShape implements AreableShape {
    @Override
    public double getArea() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
