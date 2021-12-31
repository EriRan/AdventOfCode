package fi.eriran._2021.day7.calculation.fuel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FuelConsumedIncrementingCalculatorTest {

    private final FuelConsumedIncrementingCalculator fuelConsumedIncrementingCalculator = new FuelConsumedIncrementingCalculator();

    @Test
    void examples() {
        List<Integer> sortedPositions = Arrays.asList(0,1,1,2,2,2,4,7,14,16);

        // New optiomal alignment position
        assertEquals(
                168,
                fuelConsumedIncrementingCalculator.calculate(sortedPositions, 5)
        );

        // Old alignment position from part one is now a worse solution
        assertEquals(
                206,
                fuelConsumedIncrementingCalculator.calculate(sortedPositions, 2)
        );
    }

}