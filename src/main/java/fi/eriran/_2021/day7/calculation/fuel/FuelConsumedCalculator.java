package fi.eriran._2021.day7.calculation.fuel;

import java.util.List;

public interface FuelConsumedCalculator {

    int calculate(List<Integer> sortedPositions, int alignmentPosition);
}
