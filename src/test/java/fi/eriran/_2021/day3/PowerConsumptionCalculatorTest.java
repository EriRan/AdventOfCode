package fi.eriran._2021.day3;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerConsumptionCalculatorTest {

    @Test
    void exampleCase() {
        assertEquals(
                198,
                new PowerConsumptionCalculator().calculate(new MultiLineInputParserProxy().parse("2021/day3"))
        );
    }
}