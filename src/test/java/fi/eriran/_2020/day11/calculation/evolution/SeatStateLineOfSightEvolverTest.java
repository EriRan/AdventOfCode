package fi.eriran._2020.day11.calculation.evolution;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import fi.eriran._2020.day11.calculation.OccupiedSeatCounter;
import fi.eriran._2020.day11.parser.SeatMapParser;
import fi.eriran._2020.day11.pojo.seat.SeatMap;
import fi.eriran._2020.day11.util.SeatMapStringifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Part two seat state evolver
 */
class SeatStateLineOfSightEvolverTest {

    @Test
    void example() {
        SeatMap originalSeatMap = new SeatMapParser().parse(new MultiLineInputParserProxy().parse("2020/Day11TestInput"));
        System.out.println("Original: \n" + new SeatMapStringifier().print(originalSeatMap));
        new SeatMapStringifier().print(originalSeatMap);
        SeatMap evolvedMap = new SeatStateLineOfSightEvolver()
                .createEvolved(
                        originalSeatMap
                );
        System.out.println("Evolved: \n" + new SeatMapStringifier().print(evolvedMap));
        assertEquals(26, new OccupiedSeatCounter().count(evolvedMap));
    }
}