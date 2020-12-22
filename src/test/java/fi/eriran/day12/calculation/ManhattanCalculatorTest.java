package fi.eriran.day12.calculation;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day12.calculation.flight.FlightPathCalculator;
import fi.eriran.day12.parser.DirectionCommandParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManhattanCalculatorTest {

    @Test
    void example() {
        assertEquals(
                25,
                new ManhattanCalculator().calculate(
                        new FlightPathCalculator().calculate(
                                new DirectionCommandParser().parse(
                                        new LineInputParserProxy().parse("Day12TestInput")
                                )
                        )
                )
        );

    }
}