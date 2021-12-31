package fi.eriran._2021.day1;

import fi.eriran.common.parser.multiline.IntegerMultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SonarDepthIncreaseCalculatorTest {

    @Test
    void exampleCase() {
        int increases = new SonarDepthIncreaseCalculator()
                .calculate(new IntegerMultiLineInputParserProxy().parse("2021/day1"));
        assertEquals(7, increases);
    }
}