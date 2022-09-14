package uz.bakhromjon;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    @Override
    public double areaSum(List<AreableShape> shapes) {
        double sum = 0d;
        for (AreableShape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}
