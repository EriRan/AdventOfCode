package fi.eriran._2021.day6;

import fi.eriran._2021.day6.constant.LanterfishConstant;
import fi.eriran.common.parser.IntegerOneLineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartOneLanterfishCounterTest {

    private final PartOneLanterfishCounter lanterfishCounter = new PartOneLanterfishCounter();

    @Test
    void example() {
        List<Integer> lines = new IntegerOneLineInputParserProxy().parse("2021/day6", ",");
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