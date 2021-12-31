package fi.eriran._2021.day6;

import fi.eriran.common.parser.IntegerOneLineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartTwoLanterfishCounterTest {

    private final PartTwoLanterfishCounter lanterfishCounter = new PartTwoLanterfishCounter();

    @Test
    void example() {
        List<Integer> lines = new IntegerOneLineInputParserProxy().parse("2021/day6", ",");
        assertEquals(
                26984457539L,
                lanterfishCounter.count(lines)
        );
    }
}