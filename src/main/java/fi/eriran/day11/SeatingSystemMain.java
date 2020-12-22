package fi.eriran.day11;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day11.calculation.OccupiedSeatCounter;
import fi.eriran.day11.calculation.evolution.SeatStateEvolver;
import fi.eriran.day11.parser.SeatMapParser;

public class SeatingSystemMain {

    public static void main(String[] args) {
        System.out.println("Part one occupied seat count: "
        + new OccupiedSeatCounter().count(
                new SeatStateEvolver().createEvolved(
                        new SeatMapParser().parse(
                                new LineInputParserProxy().parse("Day11Input")
                        )
                )
        ));
    }
}
