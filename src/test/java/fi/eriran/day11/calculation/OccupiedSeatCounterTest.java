package fi.eriran.day11.calculation;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day11.calculation.evolution.SeatStateEvolver;
import fi.eriran.day11.parser.SeatMapParser;
import fi.eriran.day11.pojo.seat.SeatMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OccupiedSeatCounterTest {

    @Test
    void example() {
        SeatMap evolvedMap = new SeatStateEvolver()
                .createEvolved(
                        new SeatMapParser().parse(new LineInputParserProxy().parse("Day11TestInput"))
                );
        assertEquals(37, new OccupiedSeatCounter().count(evolvedMap));

    }
}