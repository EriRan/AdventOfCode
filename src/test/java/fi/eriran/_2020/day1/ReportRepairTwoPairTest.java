package fi.eriran._2020.day1;

import fi.eriran.common.parser.multiline.IntegerMultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportRepairTwoPairTest {

    @Test
    void pairFound() {
        int result = new ReportRepairerTwoPair()
                .repair(new IntegerMultiLineInputParserProxy().parse("2020/day1TestInput"));
        assertEquals(514579, result);
    }
}