package fi.eriran.twozerotwozero.day13.calculation.earliest;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.twozerotwozero.day13.parser.TimetableParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EarliestBuslineResponseHandlerTest {

    @Test
    void example() {
        assertEquals(
                295,
                new EarliestBuslineResponseHandler().handle(
                        new EarliestBuslineFinder().find(
                                new TimetableParser().parse(
                                        new LineInputParserProxy().parse("Day13TestInput")
                                )
                        )
                )
        );
    }
}