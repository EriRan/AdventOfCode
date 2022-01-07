package fi.eriran._2021.day8;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartTwoCalculatorTest {

    private final PartTwoCalculator calculator = new PartTwoCalculator();

    @Test
    void shortExample() {
        List<String> lines = new MultiLineInputParserProxy().parse("2021/day8_short");
        assertEquals(
                5353,
                calculator.calculate(lines)
        );
    }

    @Test
    void example() {
        List<String> lines = new MultiLineInputParserProxy().parse("2021/day8");
        assertEquals(
                61229,
                calculator.calculate(lines)
        );
    }
}