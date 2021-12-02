package fi.eriran.twozerotwozero.day11.calculation.evolution.rule.adjacent;

import fi.eriran.twozerotwozero.day11.calculation.evolution.rule.adjacent.constant.AdjacentCalculatorConstant;
import fi.eriran.twozerotwozero.day11.pojo.seat.SeatMap;

public class AdjacentCalculator {

    private final OccupiedAdjacentDirectionChecker directionChecker;

    public AdjacentCalculator() {
        directionChecker = new OccupiedAdjacentDirectionChecker();
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
        int count = 0;
        if (directionChecker.upperLeft(seatMap, x, y)) {
            count++;
        }
        if (count < AdjacentCalculatorConstant.MAX_OCCUPIED_SEATS_TO_BE_USABLE && directionChecker.up(seatMap, x, y)) {
            count++;
        }
        if (count < AdjacentCalculatorConstant.MAX_OCCUPIED_SEATS_TO_BE_USABLE && directionChecker.upperRight(seatMap, x, y)) {
            count++;
        }
        if (count < AdjacentCalculatorConstant.MAX_OCCUPIED_SEATS_TO_BE_USABLE && directionChecker.right(seatMap, x, y)) {
            count++;
        }
        if (count < AdjacentCalculatorConstant.MAX_OCCUPIED_SEATS_TO_BE_USABLE && directionChecker.lowerRight(seatMap, x, y)) {
            count++;
        }
        if (count < AdjacentCalculatorConstant.MAX_OCCUPIED_SEATS_TO_BE_USABLE && directionChecker.down(seatMap, x, y)) {
            count++;
        }
        if (count < AdjacentCalculatorConstant.MAX_OCCUPIED_SEATS_TO_BE_USABLE && directionChecker.lowerLeft(seatMap, x, y)) {
            count++;
        }
        if (count < AdjacentCalculatorConstant.MAX_OCCUPIED_SEATS_TO_BE_USABLE && directionChecker.left(seatMap, x, y)) {
            count++;
        }
        return count;
    }
}
