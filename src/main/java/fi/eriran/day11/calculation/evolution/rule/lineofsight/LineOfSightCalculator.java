package fi.eriran.day11.calculation.evolution.rule.lineofsight;

import fi.eriran.day11.pojo.seat.SeatMap;

public class LineOfSightCalculator {

    private final OccupiedLineOfSightDirectionChecker directionChecker;

    public LineOfSightCalculator() {
        this.directionChecker = new OccupiedLineOfSightDirectionChecker();
    }

    public boolean hasAnyOccupiedSeatsInSight(SeatMap seatMap, int x, int y) {
        if (directionChecker.upperLeft(seatMap, x, y)) {
            return true;
        }
        if (directionChecker.up(seatMap, x, y)) {
            return true;
        }
        if (directionChecker.upperRight(seatMap, x, y)) {
            return true;
        }
        if (directionChecker.right(seatMap, x, y)) {
            return true;
        }
        if (directionChecker.lowerRight(seatMap, x, y)) {
            return true;
        }
        if (directionChecker.down(seatMap, x, y)) {
            return true;
        }
        if (directionChecker.lowerLeft(seatMap, x, y)) {
            return true;
        }
        return directionChecker.left(seatMap, x, y);
    }

    public int countOccupiedSeatsInSight(SeatMap seatMap, int x, int y) {
        int count = 0;
        if (directionChecker.upperLeft(seatMap, x, y)) {
            count++;
        }
        if (directionChecker.up(seatMap, x, y)) {
            count++;
        }
        if (directionChecker.upperRight(seatMap, x, y)) {
            count++;
        }
        if (directionChecker.right(seatMap, x, y)) {
            count++;
        }
        if (directionChecker.lowerRight(seatMap, x, y)) {
            count++;
        }
        if (directionChecker.down(seatMap, x, y)) {
            count++;
        }
        if (directionChecker.lowerLeft(seatMap, x, y)) {
            count++;
        }
        if (directionChecker.left(seatMap, x, y)) {
            count++;
        }
        return count;
    }
}
