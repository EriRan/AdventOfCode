package fi.eriran._2021.day5;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartTwoOverlappingLinesTest {

    private final PartTwoOverlappingLines partTwo = new PartTwoOverlappingLines();

    @Test
    void example() {
        assertEquals(
                12,
                partTwo.count(
                        new MultiLineInputParserProxy().parse("2021/day5")
                )
        );
    }
}