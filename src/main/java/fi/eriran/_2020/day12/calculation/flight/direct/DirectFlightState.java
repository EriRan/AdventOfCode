package fi.eriran._2020.day12.calculation.flight.direct;

import fi.eriran._2020.day12.calculation.flight.AbstractFlightState;

class DirectFlightState extends AbstractFlightState {

    private int currentDirection;

    public DirectFlightState() {
        super();
        currentDirection = 90;
    }

    @Override
    public int getEastDistance() {
        return eastDistance;
    }

    @Override
    public int getNorthDistance() {
        return northDistance;
    }

    @Override
    public void moveEast(int amount) {
        eastDistance += amount;
    }

    @Override
    public void moveSouth(int amount) {
        northDistance -= amount;
    }

    @Override
    public void moveWest(int amount) {
        eastDistance -= amount;
    }

    @Override
    public void moveNorth(int amount) {
        northDistance += amount;
    }

    @Override
    public void turnLeft(int amount) {
        int newDirection = currentDirection - amount;
        newDirection = newDirection % 360;
        if (newDirection < 0) {
            currentDirection = 360 + newDirection;
        } else {
            currentDirection = newDirection;
        }
    }

    @Override
    public void turnRight(int amount) {
        int newDirection = currentDirection + amount;
        currentDirection = newDirection % 360;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    @Override
    public void moveForward(int amount) {
        switch (currentDirection) {
            case 90:
                moveEast(amount);
                break;
            case 180:
                moveSouth(amount);
                break;
            case 270:
                moveWest(amount);
                break;
            case 0:
                moveNorth(amount);
                break;
            default:
                throw new IllegalStateException("Only North, East, West and South directions are supported. " +
                        "Encountered: " + currentDirection);
        }
    }
}
