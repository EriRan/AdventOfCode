package fi.eriran.day12.calculation.flight;

public abstract class AbstractFlightState implements FlightState {

    protected int eastDistance;
    protected int northDistance;
    protected int currentDirection;

    public AbstractFlightState() {
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
}
