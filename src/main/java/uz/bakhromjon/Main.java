package uz.bakhromjon;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        Circle circle = new Circle(10);
        Cube cube = new Cube(10);
        NoAreableShape noAreableShape = new NoAreableShape();
        List<AreableShape> shapes = List.of(square, circle, cube);
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
        ResultFormatter resultFormatter = new ResultFormatter(areaCalculatorV2);
        System.out.println(resultFormatter.json(shapes));
        System.out.println(resultFormatter.csv(shapes));
    }
}
