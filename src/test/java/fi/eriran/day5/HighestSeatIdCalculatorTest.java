package fi.eriran.day5;

import com.google.common.io.Resources;
import fi.eriran.day5.seat.SeatFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class HighestSeatIdCalculatorTest {

    @Test
    void example() throws IOException {
        assertEquals(
                820,
                new HighestSeatIdCalculator().calculate(
                        new SeatFactory().build(Resources.getResource("day5TestInput"))
                )
        );
    }
}