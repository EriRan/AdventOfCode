package fi.eriran._2021.day1;

import fi.eriran._2021.day1.SonarDepthIncreaseCalculator;
import fi.eriran.common.parser.IntegerInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SonarDepthIncreaseCalculatorTest {

    @Test
    void exampleCase() {
        int increases = new SonarDepthIncreaseCalculator()
                .calculate(new IntegerInputParserProxy().parse("2021/day1"));
        assertEquals(7, increases);
    }
}