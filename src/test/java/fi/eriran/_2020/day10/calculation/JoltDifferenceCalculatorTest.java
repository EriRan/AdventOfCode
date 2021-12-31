package fi.eriran._2020.day10.calculation;

import fi.eriran.common.parser.multiline.IntegerInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JoltDifferenceCalculatorTest {

    @Test
    void example() {
        assertEquals(
                220,
                new JoltDifferenceCalculator().oneJoltsMultipliedWithThreeJolts(
                        new JoltDifferenceContainerFactory().find(
                                new IntegerInputParserProxy().parse("2020/Day10TestInput")
                        )
                )
        );

    }
}