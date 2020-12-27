package fi.eriran.day14.calculation;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day14.parser.BitCommandParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitStateSumCalculatorTest {

    @Test
    void example() {
        assertEquals(
                165,
                new BitStateSumCalculator().calculate(
                        new BitCommandRunner().run(
                                new BitCommandParser().parse(
                                        new LineInputParserProxy().parse("Day14TestInput")
                                )
                        )
                )
        );


    }
}