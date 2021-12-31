package fi.eriran._2021.day4;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BingoPartOneTest {

    @Test
    void exampleInput() {
        assertEquals(
                4512,
                new BingoPartOne().calculateFinalScore(new MultiLineInputParserProxy().parse("2021/day4"))
        );
    }
}