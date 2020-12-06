package fi.eriran.day1;

import fi.eriran.common.parser.NumberInputParserProxy;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportRepairTwoPairTest {

    @Test
    void pairFound() throws IOException {
        int result = new ReportRepairerTwoPair()
                .repair(new NumberInputParserProxy().parse("day1TestInput"));
        assertEquals(514579, result);
    }
}