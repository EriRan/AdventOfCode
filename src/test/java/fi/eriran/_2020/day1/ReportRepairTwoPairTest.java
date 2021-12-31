package fi.eriran._2020.day1;

import fi.eriran.common.parser.multiline.IntegerInputParserProxy;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportRepairTwoPairTest {

    @Test
    void pairFound() throws IOException {
        int result = new ReportRepairerTwoPair()
                .repair(new IntegerInputParserProxy().parse("2020/day1TestInput"));
        assertEquals(514579, result);
    }
}