package fi.eriran._2021.day7.calculation.fuel;

import fi.eriran._2021.day7.calculation.fuel.FuelConsumedSimpleCalculator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FuelConsumedSimpleCalculatorTest {

    private final FuelConsumedSimpleCalculator fuelConsumedSimpleCalculator = new FuelConsumedSimpleCalculator();

    @Test
    void examples() {
        List<Integer> sortedPositions = Arrays.asList(0,1,1,2,2,2,4,7,14,16);
        // This is the optimal position and the answer expected in the provided example
        assertEquals(
                37,
                fuelConsumedSimpleCalculator.calculate(sortedPositions, 2)
        );
        // The rest of these are worse positions but they should have these fuel counts according to the examples
        assertEquals(
                41,
                fuelConsumedSimpleCalculator.calculate(sortedPositions, 1)
        );
        assertEquals(
                39,
                fuelConsumedSimpleCalculator.calculate(sortedPositions, 3)
        );
        assertEquals(
                71,
                fuelConsumedSimpleCalculator.calculate(sortedPositions, 10)
        );
    }
}