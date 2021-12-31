package fi.eriran._2021.day7.calculation.fuel;

import java.util.List;

public class FuelConsumedIncrementingCalculator implements FuelConsumedCalculator {
    @Override
    public int calculate(List<Integer> sortedPositions, int alignmentPosition) {
        int fuelConsumed = 0;
        for (Integer sortedPosition : sortedPositions) {
            int difference = calculateDifference(alignmentPosition, sortedPosition);
            fuelConsumed += calculateWithIncrementing(difference);
        }
        return fuelConsumed;
    }

    private int calculateDifference(int alignmentPosition, Integer sortedPosition) {
        int difference;
        if (sortedPosition > alignmentPosition) {
            difference = sortedPosition - alignmentPosition;
        } else {
            difference = alignmentPosition - sortedPosition;
        }
        return difference;
    }

    private int calculateWithIncrementing(int difference) {
        int fuelConsumed = 0;
        for (int i = 1; i <= difference; i++) {
            fuelConsumed += i;
        }
        return fuelConsumed;
    }
}
