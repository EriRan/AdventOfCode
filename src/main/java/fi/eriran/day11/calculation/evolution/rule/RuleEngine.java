package fi.eriran.day11.calculation.evolution.rule;

import fi.eriran.day11.pojo.Position;
import fi.eriran.day11.pojo.seat.SeatMap;

public interface RuleEngine {

    boolean shouldBecomeOccupied(SeatMap previousState, int x, int y, Position currentPosition);
    boolean shouldBecomeEmpty(SeatMap previousState, int x, int y, Position currentPosition);
}
