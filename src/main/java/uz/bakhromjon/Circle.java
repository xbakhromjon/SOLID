package uz.bakhromjon;

public class Circle implements AreableShape {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
