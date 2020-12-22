package fi.eriran.day11.calculation.evolution.rule.adjacent;

import fi.eriran.day11.pojo.seat.SeatMap;

public class AdjacentCalculator {

    private final OccupiedDirectionChecker directionChecker;

    public AdjacentCalculator() {
        directionChecker = new OccupiedDirectionChecker();
    }

    public boolean hasAdjacentOccupied(SeatMap seatMap, int x, int y) {
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

    public int countAdjacentOccupied(SeatMap seatMap, int x, int y) {
        int adjacentOccupiedCount = 0;
        if (directionChecker.upperLeft(seatMap, x, y)) {
            adjacentOccupiedCount++;
        }
        if (directionChecker.up(seatMap, x, y)) {
            adjacentOccupiedCount++;
        }
        if (directionChecker.upperRight(seatMap, x, y)) {
            adjacentOccupiedCount++;
        }
        if (directionChecker.right(seatMap, x, y)) {
            adjacentOccupiedCount++;
        }
        if (directionChecker.lowerRight(seatMap, x, y)) {
            adjacentOccupiedCount++;
        }
        if (directionChecker.down(seatMap, x, y)) {
            adjacentOccupiedCount++;
        }
        if (directionChecker.lowerLeft(seatMap, x, y)) {
            adjacentOccupiedCount++;
        }
        if (directionChecker.left(seatMap, x, y)) {
            adjacentOccupiedCount++;
        }
        return adjacentOccupiedCount;
    }
}
