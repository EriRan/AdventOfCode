package fi.eriran.twozerotwozero.day11.calculation.evolution.rule;

import fi.eriran.twozerotwozero.day11.pojo.Position;
import fi.eriran.twozerotwozero.day11.pojo.seat.SeatMap;

public interface RuleEngine {

    boolean shouldBecomeOccupied(SeatMap previousState, int x, int y, Position currentPosition);
    boolean shouldBecomeEmpty(SeatMap previousState, int x, int y, Position currentPosition);
}
