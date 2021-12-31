package fi.eriran._2021.day7.calculation;

import fi.eriran.common.parser.IntegerOneLineInputCommaParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlignmentFuelCalculatorTest {

    private final AlignmentFuelCalculator alignmentFuelCalculator = new AlignmentFuelCalculator();

    @Test
    void example() {
        List<Integer> input = new IntegerOneLineInputCommaParserProxy().parse("2021/day7");
        assertEquals(
                37,
                alignmentFuelCalculator.calculate(input)
        );
    }
}