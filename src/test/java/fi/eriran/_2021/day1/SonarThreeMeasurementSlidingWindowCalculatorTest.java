package fi.eriran._2021.day1;

import fi.eriran.common.parser.multiline.IntegerInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SonarThreeMeasurementSlidingWindowCalculatorTest {

    @Test
    void example() {
        int increases = new SonarThreeMeasurementSlidingWindowCalculator()
                .calculate(new IntegerInputParserProxy().parse("2021/day1"));
        assertEquals(5, increases);
    }
}