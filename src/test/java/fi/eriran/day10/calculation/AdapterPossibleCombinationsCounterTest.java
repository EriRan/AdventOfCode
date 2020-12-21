package fi.eriran.day10.calculation;

import fi.eriran.common.parser.IntegerInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterPossibleCombinationsCounterTest {

    @Test
    void example() {
        assertEquals(
                19208,
                new AdapterPossibleCombinationsCounter().count(
                        new IntegerInputParserProxy().parse("Day10TestInput")
                )
        );

    }
}