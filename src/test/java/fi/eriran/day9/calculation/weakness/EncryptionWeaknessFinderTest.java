package fi.eriran.day9.calculation.weakness;

import fi.eriran.common.parser.LongInputParserProxy;
import fi.eriran.day9.calculation.InvalidNumberFinder;
import fi.eriran.day9.parser.PreambleContainerFactory;
import org.junit.jupiter.api.Test;

import static fi.eriran.day9.testconstant.PreambleTestConstant.PART_ONE_PREAMBLE_TEST_SIZE;
import static org.junit.jupiter.api.Assertions.*;

class EncryptionWeaknessFinderTest {

    @Test
    void example() {
        assertEquals(
                62,
                new EncryptionWeaknessFinder().find(
                        new PreambleContainerFactory().parser(
                                new LongInputParserProxy().parse("Day9TestInput"),
                                PART_ONE_PREAMBLE_TEST_SIZE
                        )
                )
        );
    }
}