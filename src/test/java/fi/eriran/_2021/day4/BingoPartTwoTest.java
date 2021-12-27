package fi.eriran._2021.day4;

import fi.eriran.common.parser.LineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BingoPartTwoTest {

    @Test
    void exampleInput() {
        assertEquals(
                1924,
                new BingoPartTwo().calculateFinalScore(new LineInputParserProxy().parse("2021/day4"))
        );
    }
}