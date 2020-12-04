package fi.eriran.day1;

import com.google.common.io.Resources;
import fi.eriran.common.parser.NumberInputParser;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportRepairTwoPairTest {

    @Test
    void pairFound() throws IOException {
        int result = new ReportRepairerTwoPair()
                .repair(new NumberInputParser().parse(Resources.getResource("day1TestInput")));
        assertEquals(514579, result);
    }
}