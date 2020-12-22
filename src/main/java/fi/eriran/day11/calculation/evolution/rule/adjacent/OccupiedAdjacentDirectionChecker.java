package fi.eriran.day11.calculation.evolution.rule.adjacent;

import fi.eriran.day11.calculation.evolution.rule.DirectionChecker;
import fi.eriran.day11.pojo.seat.SeatMap;

import static fi.eriran.day11.util.SeatMapCondition.isOccupied;

public class OccupiedAdjacentDirectionChecker implements DirectionChecker {

    public boolean upperLeft(SeatMap seatMap, int x, int y) {
        return y > 0 && x > 0 && isOccupied(seatMap, x - 1, y - 1);
    }

    public boolean up(SeatMap seatMap, int x, int y) {
        return y > 0 && isOccupied(seatMap, x, y - 1);
    }

    public boolean upperRight(SeatMap seatMap, int x, int y) {
        return y > 0 && x < seatMap.getMaxX() && isOccupied(seatMap, x + 1, y - 1);
    }

    public boolean right(SeatMap seatMap, int x, int y) {
        return x < seatMap.getMaxX() && isOccupied(seatMap, x + 1, y);
    }

    public boolean lowerRight(SeatMap seatMap, int x, int y) {
        return y < seatMap.getMaxY() && x < seatMap.getMaxX() && isOccupied(seatMap, x + 1, y + 1);
    }

    public boolean down(SeatMap seatMap, int x, int y) {
        return y < seatMap.getMaxY() && isOccupied(seatMap, x, y + 1);
    }

    public boolean lowerLeft(SeatMap seatMap, int x, int y) {
        return y < seatMap.getMaxY() && x > 0 && isOccupied(seatMap, x - 1, y + 1);
    }

    public boolean left(SeatMap seatMap, int x, int y) {
        return x > 0 && isOccupied(seatMap, x - 1, y);
    }
}
