package fi.eriran._2021;

import fi.eriran.common.parser.IntegerInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class SonarDepthIncreaseCalculatorTest {

    @Test
    void exampleCase() {
        int increases = new SonarDepthIncreaseCalculator()
                .calculate(new IntegerInputParserProxy().parse("2021/day1PartOne"));
        assertEquals(7, increases);
    }
}