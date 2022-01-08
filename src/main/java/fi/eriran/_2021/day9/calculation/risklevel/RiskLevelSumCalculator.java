package fi.eriran._2021.day9.calculation.risklevel;

import fi.eriran._2021.day9.calculation.map.lowpoint.objects.LowPoint;

import java.util.Collection;

public class RiskLevelSumCalculator {

    public long calculate(Collection<LowPoint> lowPoints) {
        return lowPoints.stream()
                .map(this::calculateRiskLevel)
                .mapToInt(value -> value)
                .sum();
    }

    private int calculateRiskLevel(LowPoint lowPoint) {
        return lowPoint.getHeight() + 1;
    }
}
