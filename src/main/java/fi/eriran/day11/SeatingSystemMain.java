package fi.eriran.day11;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day11.calculation.OccupiedSeatCounter;
import fi.eriran.day11.calculation.evolution.SeatStateAdjacentEvolver;
import fi.eriran.day11.calculation.evolution.SeatStateLineOfSightEvolver;
import fi.eriran.day11.parser.SeatMapParser;

public class SeatingSystemMain {

    public static void main(String[] args) {
        System.out.println("Part one occupied seat count: "
        + new OccupiedSeatCounter().count(
                new SeatStateAdjacentEvolver().createEvolved(
                        new SeatMapParser().parse(
                                new LineInputParserProxy().parse("Day11Input")
                        )
                )
        ));
        System.out.println("Part two occupied seat count: "
                + new OccupiedSeatCounter().count(
                new SeatStateLineOfSightEvolver().createEvolved(
                        new SeatMapParser().parse(
                                new LineInputParserProxy().parse("Day11Input")
                        )
                )
        ));
    }
}
