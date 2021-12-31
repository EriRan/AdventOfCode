package fi.eriran._2021.day7.calculation.fuel;

import java.util.List;

public class FuelConsumedIncrementingCalculator implements FuelConsumedCalculator {
    @Override
    public int calculate(List<Integer> sortedPositions, int alignmentPosition) {
        int fuelConsumed = 0;
        for (Integer sortedPosition : sortedPositions) {
            if (sortedPosition > alignmentPosition) {
                int difference = sortedPosition - alignmentPosition;
                fuelConsumed += calculateWithIncrementing(difference);
            } else {
                int difference = alignmentPosition - sortedPosition;
                fuelConsumed += calculateWithIncrementing(difference);
            }
        }
        return fuelConsumed;
    }

    private int calculateWithIncrementing(int difference) {
        int fuelConsumed = 0;
        for (int i = 1; i <= difference; i++) {
            fuelConsumed += i;
        }
        return fuelConsumed;
    }
}
