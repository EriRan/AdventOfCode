package fi.eriran._2021.day7.calculation.fuel;

import java.util.List;

public class FuelConsumedSimpleCalculator {

    public int calculate(List<Integer> sortedPositions, int alignmentPosition) {
        int fuelConsumed = 0;
        for (Integer sortedPosition : sortedPositions) {
            if (sortedPosition > alignmentPosition) {
                fuelConsumed += sortedPosition - alignmentPosition;
            } else {
                fuelConsumed += alignmentPosition - sortedPosition;
            }
        }
        return fuelConsumed;
    }
}
