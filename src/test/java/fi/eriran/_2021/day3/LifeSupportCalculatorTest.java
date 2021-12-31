package fi.eriran._2021.day3;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeSupportCalculatorTest {

    @Test
    void example() {
        assertEquals(
                230,
                new LifeSupportCalculator().calculate(new MultiLineInputParserProxy().parse("2021/day3"))
        );
    }
}