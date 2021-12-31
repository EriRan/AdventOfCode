package fi.eriran._2021.day7.calculation;

import fi.eriran._2021.day7.calculation.fuel.FuelConsumedIncrementingCalculator;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlignmentFuelIncrementingCalculator implements AlignmentFuelCalculator {

    private final FuelConsumedIncrementingCalculator fuelConsumedIncrementingCalculator;

    private static final Logger logger = Logger.getGlobal();

    public AlignmentFuelIncrementingCalculator() {
        fuelConsumedIncrementingCalculator = new FuelConsumedIncrementingCalculator();
    }

    @Override
    public int calculate(List<Integer> positions) {
        double average = positions.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();
        logger.log(Level.INFO, "Average is: {0}", average);
        if (average % 1 == 0) {
            return fuelConsumedIncrementingCalculator.calculate(positions, (int) average);
        } else {
            // Try both sides of the average number: the one without decimal part and one incremented with one, so e.g.
            // for 12.4, we would try 12 and 13, so the both sides.
            // Without decimals
            int fuelConsumedCandidateOne = fuelConsumedIncrementingCalculator.calculate(positions, (int) average);
            // Rounded one increment up
            int fuelConsumedCandidateTwo = fuelConsumedIncrementingCalculator.calculate(positions, (int) average + 1);
            // Return the smaller one
            return Math.min(fuelConsumedCandidateOne, fuelConsumedCandidateTwo);
        }
    }
}
