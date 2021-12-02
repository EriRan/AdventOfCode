package fi.eriran._2020.day9.calculation.weakness;

import fi.eriran.common.parser.LongInputParserProxy;
import fi.eriran._2020.day9.parser.PreambleContainerFactory;
import org.junit.jupiter.api.Test;

import static fi.eriran._2020.day9.testconstant.PreambleTestConstant.PART_ONE_PREAMBLE_TEST_SIZE;
import static org.junit.jupiter.api.Assertions.*;

class EncryptionWeaknessFinderTest {

    @Test
    void example() {
        assertEquals(
                62,
                new EncryptionWeaknessFinder().find(
                        new PreambleContainerFactory().parser(
                                new LongInputParserProxy().parse("2020/Day9TestInput"),
                                PART_ONE_PREAMBLE_TEST_SIZE
                        )
                )
        );
    }
}