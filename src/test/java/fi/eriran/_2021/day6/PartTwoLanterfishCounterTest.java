package fi.eriran._2021.day6;

import fi.eriran.common.parser.LineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartTwoLanterfishCounterTest {

    private final PartTwoLanterfishCounter lanterfishCounter = new PartTwoLanterfishCounter();

    @Test
    void example() {
        List<String> lines = new LineInputParserProxy().parse("2021/day6");
        assertEquals(
                26984457539L,
                lanterfishCounter.count(lines)
        );
    }
}