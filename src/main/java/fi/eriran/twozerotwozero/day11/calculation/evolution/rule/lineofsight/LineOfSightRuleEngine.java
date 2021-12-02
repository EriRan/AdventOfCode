package fi.eriran.twozerotwozero.day11.calculation.evolution.rule.lineofsight;

import fi.eriran.twozerotwozero.day11.calculation.evolution.rule.RuleEngine;
import fi.eriran.twozerotwozero.day11.calculation.evolution.rule.lineofsight.constant.LineOfSightCalculationConstant;
import fi.eriran.twozerotwozero.day11.pojo.Position;
import fi.eriran.twozerotwozero.day11.pojo.seat.SeatMap;

public class LineOfSightRuleEngine implements RuleEngine {

    private final LineOfSightCalculator lineOfSightCalculator;

    public LineOfSightRuleEngine() {
        lineOfSightCalculator = new LineOfSightCalculator();
    }

    public boolean shouldBecomeOccupied(SeatMap previousState, int x, int y, Position currentPosition) {
        return Position.EMPTY_SEAT.equals(currentPosition)
                && !hasAnySeatsInLineOfSight(previousState, x, y);
    }

    public boolean shouldBecomeEmpty(SeatMap previousState, int x, int y, Position currentPosition) {
        return Position.OCCUPIED_SEAT.equals(currentPosition)
                && hasFiveOrMoreAdjacentOccupied(previousState, x, y);
    }

    private boolean hasAnySeatsInLineOfSight(SeatMap seatMap, int x, int y) {
        return lineOfSightCalculator.hasAnyOccupiedSeatsInSight(seatMap, x, y);
    }

    private boolean hasFiveOrMoreAdjacentOccupied(SeatMap seatMap, int x, int y) {
        return lineOfSightCalculator
                .countOccupiedSeatsInSight(seatMap, x, y) >= LineOfSightCalculationConstant.MAX_OCCUPIED_SEATS_TO_BE_USABLE;
    }
}
