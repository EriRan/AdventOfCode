package fi.eriran._2020.day13.calculation.earliest;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import fi.eriran._2020.day13.parser.TimetableParser;
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
                                        new MultiLineInputParserProxy().parse("2020/Day13TestInput")
                                )
                        )
                )
        );
    }
}