package uz.bakhromjon;

import java.util.List;

public class ResultFormatter {
    private final IAreaCalculator areaCalculator;

    public ResultFormatter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<AreableShape> shapes) {
        return "{areaSum: %s}".formatted(areaCalculator.areaSum(shapes));
    }

    public String csv(List<AreableShape> shapes) {
        return "area_sum, %s".formatted(areaCalculator.areaSum(shapes));
    }

}
