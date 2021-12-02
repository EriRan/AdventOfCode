package fi.eriran.twozerotwozero.day1;

import fi.eriran.common.parser.IntegerInputParserProxy;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportRepairerThreePairTest {

    @Test
    void threePairFound() throws IOException {
        int result = new ReportRepairerThreePair()
                .repair(new IntegerInputParserProxy().parse("day1TestInput"));
        assertEquals(241861950, result);
    }
}