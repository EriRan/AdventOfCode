package fi.eriran._2020.day11.calculation.evolution.rule;

import fi.eriran._2020.day11.pojo.Position;
import fi.eriran._2020.day11.pojo.seat.SeatMap;

public interface RuleEngine {

    boolean shouldBecomeOccupied(SeatMap previousState, int x, int y, Position currentPosition);
    boolean shouldBecomeEmpty(SeatMap previousState, int x, int y, Position currentPosition);
}
