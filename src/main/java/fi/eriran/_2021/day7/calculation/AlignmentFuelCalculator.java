package fi.eriran._2021.day7.calculation;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AlignmentFuelCalculator {

    private final IntegerMedianCalculator integerMedianCalculator;
    private final FuelConsumedCalculator fuelConsumedCalculator;

    public AlignmentFuelCalculator() {
        integerMedianCalculator = new IntegerMedianCalculator();
        fuelConsumedCalculator = new FuelConsumedCalculator();
    }

    public int calculate(Collection<Integer> initialPositions) {
        List<Integer> sortedPositions = initialPositions.stream()
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        double median = integerMedianCalculator.calculate(sortedPositions);
        // Is median a whole? If it is, we only need to check one possible position
        if (median % 1 == 0) {
            return fuelConsumedCalculator.calculate(sortedPositions, (int) median);
        } else {
            // If the median is not whole but something like 12.5, we need to check fuel consumed for two positions:
            // 12 and 13, so the both sides.
            // Without decimals
            int fuelConsumedCandidateOne = fuelConsumedCalculator.calculate(sortedPositions, (int) median);
            // Rounded one increment up
            int fuelConsumedCandidateTwo = fuelConsumedCalculator.calculate(sortedPositions, (int) median + 1);
            // Return the smaller one
            return Math.min(fuelConsumedCandidateOne, fuelConsumedCandidateTwo);
        }
    }
}
