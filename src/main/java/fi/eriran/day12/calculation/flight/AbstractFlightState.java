package fi.eriran.day12.calculation.flight;

public abstract class AbstractFlightState implements FlightState {

    protected int eastDistance;
    protected int northDistance;
    protected int currentDirection;

    protected AbstractFlightState() {
        eastDistance = 0;
        northDistance = 0;
        currentDirection = 90;
    }

    public int getEastDistance() {
        return eastDistance;
    }

    public int getNorthDistance() {
        return northDistance;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    protected void changeCurrenDirectionLeft(int amount) {
        int newDirection = currentDirection - amount;
        newDirection = newDirection % 360;
        if (newDirection < 0) {
            currentDirection = 360 + newDirection;
        } else {
            currentDirection = newDirection;
        }
    }

    protected void changeCurrentDirectionRight(int amount) {
        int newDirection = currentDirection + amount;
        currentDirection = newDirection % 360;
    }
}
