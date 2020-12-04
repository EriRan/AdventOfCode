package fi.eriran.day1;

import com.google.common.io.Resources;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportRepairTest {

    @Test
    void pairFound() throws IOException {
        int result = new ReportRepair()
                .repair(new InputParser().parse(Resources.getResource("day1TestInput")));
        assertEquals(514579, result);
    }
}