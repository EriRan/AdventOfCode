package fi.eriran._2021.day6;

import fi.eriran._2021.day6.constant.LanternfishConstant;
import fi.eriran.common.parser.IntegerOneLineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartOneLanternfishCounterTest {

    private final PartOneLanternfishCounter lanterfishCounter = new PartOneLanternfishCounter();

    @Test
    void example() {
        List<Integer> lines = new IntegerOneLineInputParserProxy().parse("2021/day6", ",");
        assertEquals(
                26,
                lanterfishCounter.countAfterBreeding(lines, 18)
        );
        assertEquals(
                5934,
                lanterfishCounter.countAfterBreeding(lines, LanternfishConstant.PART_ONE_DAYS_ELAPSED)
        );
    }
}