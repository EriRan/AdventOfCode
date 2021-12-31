package fi.eriran._2021.day7.calculation;

import fi.eriran._2021.day7.calculation.fuel.FuelConsumedIncrementingCalculator;

import java.util.List;

public class AlignmentFuelIncrementingCalculator implements AlignmentFuelCalculator {

    private final FuelConsumedIncrementingCalculator fuelConsumedIncrementingCalculator;

    public AlignmentFuelIncrementingCalculator() {
        fuelConsumedIncrementingCalculator = new FuelConsumedIncrementingCalculator();
    }

    @Override
    public int calculate(List<Integer> positions) {
        double average = positions.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();
        // Think about this some more
        return fuelConsumedIncrementingCalculator.calculate(positions, (int) Math.round(average));
    }
}
