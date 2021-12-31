package fi.eriran._2021.day7.calculation;

import fi.eriran.common.parser.oneline.IntegerOneLineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlignmentFuelIncrementingCalculatorTest {

    private final AlignmentFuelIncrementingCalculator calculator = new AlignmentFuelIncrementingCalculator();

    @Test
    void example() {
        List<Integer> input = new IntegerOneLineInputParserProxy().parse("2021/day7", ",");
        assertEquals(
                168,
                calculator.calculate(input)
        );
    }
}