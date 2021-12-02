package fi.eriran._2020.day11.calculation.evolution.rule.lineofsight;

import fi.eriran._2020.day11.calculation.evolution.rule.DirectionChecker;
import fi.eriran._2020.day11.pojo.Position;
import fi.eriran._2020.day11.pojo.seat.SeatMap;

public class OccupiedLineOfSightDirectionChecker implements DirectionChecker {

    private final LineOfSightRayRuleFactory rayRuleFactory;

    public OccupiedLineOfSightDirectionChecker() {
        rayRuleFactory = new LineOfSightRayRuleFactory();
    }

    @Override
    public boolean upperLeft(SeatMap seatMap, int startX, int startY) {
        return checkDirection(seatMap, startX, startY, rayRuleFactory.createUpperLeft());
    }

    @Override
    public boolean up(SeatMap seatMap, int startX, int startY) {
        return checkDirection(seatMap, startX, startY, rayRuleFactory.createUp());
    }

    @Override
    public boolean upperRight(SeatMap seatMap, int startX, int startY) {
        return checkDirection(seatMap, startX, startY, rayRuleFactory.createUpperRight());
    }

    @Override
    public boolean right(SeatMap seatMap, int startX, int startY) {
        return checkDirection(seatMap, startX, startY, rayRuleFactory.createRight());
    }

    @Override
    public boolean lowerRight(SeatMap seatMap, int startX, int startY) {
        return checkDirection(seatMap, startX, startY, rayRuleFactory.createLowerRight());
    }

    @Override
    public boolean down(SeatMap seatMap, int startX, int startY) {
        return checkDirection(seatMap, startX, startY, rayRuleFactory.createDown());
    }

    @Override
    public boolean lowerLeft(SeatMap seatMap, int startX, int startY) {
        return checkDirection(seatMap, startX, startY, rayRuleFactory.createLowerLeft());
    }

    @Override
    public boolean left(SeatMap seatMap, int startX, int startY) {
        return checkDirection(seatMap, startX, startY, rayRuleFactory.createLeft());
    }


    private boolean checkDirection(SeatMap seatMap, int startX, int startY, LineOfSightRayRule rayRule) {
        int currentX = startX + rayRule.getxIncrement();
        int currentY = startY + rayRule.getyIncrement();
        while (currentPositionIsWithinBounds(seatMap, currentX, currentY)) {
            Position currentPosition = seatMap.getCoordinate(currentX, currentY);
            switch (currentPosition) {
                case OCCUPIED_SEAT:
                    return true;
                case EMPTY_SEAT:
                    return false;
                default:
                    break;
            }
            currentX = currentX + rayRule.getxIncrement();
            currentY = currentY + rayRule.getyIncrement();
        }
        return false;
    }

    private boolean currentPositionIsWithinBounds(SeatMap seatMap, int currentX, int currentY) {
        return currentX <= seatMap.getMaxX()
                && currentX >= 0
                && currentY <= seatMap.getMaxY()
                && currentY >= 0;
    }
}
