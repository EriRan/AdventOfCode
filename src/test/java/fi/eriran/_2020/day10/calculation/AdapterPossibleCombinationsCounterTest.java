package fi.eriran._2020.day10.calculation;

import fi.eriran.common.parser.multiline.IntegerMultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterPossibleCombinationsCounterTest {

    @Test
    void example() {
        assertEquals(
                19208,
                new AdapterPossibleCombinationsCounter().count(
                        new IntegerMultiLineInputParserProxy().parse("2020/Day10TestInput")
                )
        );

    }
}