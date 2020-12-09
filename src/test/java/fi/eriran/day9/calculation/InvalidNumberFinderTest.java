package fi.eriran.day9.calculation;

import fi.eriran.common.parser.IntegerInputParserProxy;
import fi.eriran.common.parser.LongInputParserProxy;
import fi.eriran.day9.parser.PreambleContainerFactory;
import org.junit.jupiter.api.Test;

import static fi.eriran.day9.testconstant.PreambleTestConstant.PART_ONE_PREAMBLE_TEST_SIZE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InvalidNumberFinderTest {

    @Test
    void example() {
        assertEquals(
                127,
                new InvalidNumberFinder().find(
                        new PreambleContainerFactory().parser(
                                new LongInputParserProxy().parse("Day9TestInput"),
                                PART_ONE_PREAMBLE_TEST_SIZE
                        )
                )
        );
    }
}