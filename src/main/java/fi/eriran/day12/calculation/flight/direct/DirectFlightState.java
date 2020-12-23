package fi.eriran.day12.calculation.flight.direct;

import fi.eriran.day12.calculation.flight.AbstractFlightState;

class DirectFlightState extends AbstractFlightState {

    public DirectFlightState() {
        super();
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
        changeCurrenDirectionLeft(amount);
    }

    @Override
    public void turnRight(int amount) {
        changeCurrentDirectionRight(amount);
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
