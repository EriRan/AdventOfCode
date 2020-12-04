package fi.eriran.day1;

import com.google.common.io.Resources;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReportRepairerThreePairTest {

    @Test
    void threePairFound() throws IOException {
        int result = new ReportRepairerThreePair()
                .repair(new InputParser().parse(Resources.getResource("day1TestInput")));
        assertEquals(241861950, result);
    }
}