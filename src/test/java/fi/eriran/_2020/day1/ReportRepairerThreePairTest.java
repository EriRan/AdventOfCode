package fi.eriran._2020.day1;

import fi.eriran.common.parser.multiline.IntegerInputParserProxy;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportRepairerThreePairTest {

    @Test
    void threePairFound() {
        int result = new ReportRepairerThreePair()
                .repair(new IntegerInputParserProxy().parse("2020/day1TestInput"));
        assertEquals(241861950, result);
    }
}