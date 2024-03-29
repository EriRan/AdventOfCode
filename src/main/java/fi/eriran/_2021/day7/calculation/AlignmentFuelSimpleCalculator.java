package fi.eriran._2021.day7.calculation;

import fi.eriran._2021.day7.calculation.alignment.IntegerMedianCalculator;
import fi.eriran._2021.day7.calculation.fuel.FuelConsumedSimpleCalculator;

import java.util.List;
import java.util.stream.Collectors;

public class AlignmentFuelSimpleCalculator implements AlignmentFuelCalculator{

    private final IntegerMedianCalculator integerMedianCalculator;
    private final FuelConsumedSimpleCalculator fuelConsumedSimpleCalculator;

    public AlignmentFuelSimpleCalculator() {
        integerMedianCalculator = new IntegerMedianCalculator();
        fuelConsumedSimpleCalculator = new FuelConsumedSimpleCalculator();
    }

    /**
     * I think I just got lucky here with the right answer. To have a correct answer in every case, we should select
     * the average as a starting point, then start going through numbers both plus and minus from the average point.
     * When the number starts increasing compared to the last number, we stop the search from that direction. Once we
     * have the smallest possible number, we return that.
     */
    public int calculate(List<Integer> initialPositions) {
        List<Integer> sortedPositions = initialPositions.stream()
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        double median = integerMedianCalculator.calculate(sortedPositions);
        // Is median a whole? If it is, we only need to check one possible position
        if (median % 1 == 0) {
            return fuelConsumedSimpleCalculator.calculate(sortedPositions, (int) median);
        } else {
            // If the median is not whole but something like 12.5, we need to check fuel consumed for two positions:
            // 12 and 13, so the both sides.
            // Without decimals
            int fuelConsumedCandidateOne = fuelConsumedSimpleCalculator.calculate(sortedPositions, (int) median);
            // Rounded one increment up
            int fuelConsumedCandidateTwo = fuelConsumedSimpleCalculator.calculate(sortedPositions, (int) median + 1);
            // Return the smaller one
            return Math.min(fuelConsumedCandidateOne, fuelConsumedCandidateTwo);
        }
    }
}
