package fi.eriran._2021.day5;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartOneOverlappingNonDiagonalLinesTest {

    private final PartOneOverlappingNonDiagonalLines partOne = new PartOneOverlappingNonDiagonalLines();

    @Test
    void example() {
        assertEquals(
                5,
                partOne.count(
                        new MultiLineInputParserProxy().parse("2021/day5")
                )
        );
    }
}