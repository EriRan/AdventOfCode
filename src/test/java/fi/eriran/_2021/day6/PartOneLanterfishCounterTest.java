package fi.eriran._2021.day6;

import fi.eriran._2021.day6.constant.LanterfishConstant;
import fi.eriran.common.parser.LineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartOneLanterfishCounterTest {

    private final PartOneLanterfishCounter lanterfishCounter = new PartOneLanterfishCounter();

    @Test
    void example() {
        List<String> lines = new LineInputParserProxy().parse("2021/day6");
        assertEquals(
                26,
                lanterfishCounter.countAfterBreeding(lines, 18)
        );
        assertEquals(
                5934,
                lanterfishCounter.countAfterBreeding(lines, LanterfishConstant.PART_ONE_DAYS_ELAPSED)
        );
    }
}