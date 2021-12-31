package fi.eriran._2021.day7.calculation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FuelConsumedCalculatorTest {

    private final FuelConsumedCalculator fuelConsumedCalculator = new FuelConsumedCalculator();

    @Test
    void examples() {
        List<Integer> sortedPositions = Arrays.asList(0,1,1,2,2,2,4,7,14,16);
        // This is the optimal position and the answer expected in the provided example
        assertEquals(
                37,
                fuelConsumedCalculator.calculate(sortedPositions, 2)
        );
        // The rest of these are worse positions but they should have these fuel counts according to the examples
        assertEquals(
                41,
                fuelConsumedCalculator.calculate(sortedPositions, 1)
        );
        assertEquals(
                39,
                fuelConsumedCalculator.calculate(sortedPositions, 3)
        );
        assertEquals(
                71,
                fuelConsumedCalculator.calculate(sortedPositions, 10)
        );
    }
}