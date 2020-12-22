package fi.eriran.day11.calculation.evolution.rule.lineofsight;

import fi.eriran.day11.parser.SeatMapParser;
import fi.eriran.day11.pojo.seat.SeatMap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineOfSightCalculatorTest {

    private final LineOfSightCalculator lineOfSightCalculator;

    public LineOfSightCalculatorTest() {
        lineOfSightCalculator = new LineOfSightCalculator();
    }

    @Test
    void noOccupiedInSight() {
        SeatMap seatMap = new SeatMapParser().parse(createNoOccupiedInSightData());
        //The mid point that should not have any sight to any occupied seats
        assertEquals(0, lineOfSightCalculator.countOccupiedSeatsInSight(seatMap, 3,3));
    }

    @Test
    void oneInSight() {
        SeatMap seatMap = new SeatMapParser().parse(createOneOccupiedInSight());
        //The mid point that should not have any sight to any occupied seats
        assertEquals(1, lineOfSightCalculator.countOccupiedSeatsInSight(seatMap, 3,3));
    }

    private List<String> createNoOccupiedInSightData() {
        List<String> lines = new ArrayList<>();
        lines.add(".##.##.");
        lines.add("#.#.#.#");
        lines.add("##...##");
        lines.add("...L...");
        lines.add("##...##");
        lines.add("#.#.#.#");
        lines.add(".##.##.");
        return lines;
    }

    private List<String> createOneOccupiedInSight() {
        List<String> lines = new ArrayList<>();
        lines.add(".##.###");
        lines.add("#.#.#.#");
        lines.add("##...##");
        lines.add("...L...");
        lines.add("##...##");
        lines.add("#.#.#.#");
        lines.add(".##.##.");
        return lines;
    }

}