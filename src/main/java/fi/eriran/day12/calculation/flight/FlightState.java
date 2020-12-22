package fi.eriran.day12.calculation.flight;

public class FlightState {

    private int eastDistance;
    private int northDistance;
    private int currentDirection;

    public FlightState() {
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

    public void moveEast(int amount) {
        eastDistance += amount;
    }

    public void moveSouth(int amount) {
        northDistance -= amount;
    }

    public void moveWest(int amount) {
        eastDistance -= amount;
    }

    public void moveNorth(int amount) {
        northDistance += amount;
    }

    public void turnLeft(int amount) {
        int newDirection = currentDirection - amount;
        newDirection = newDirection % 360;
        if (newDirection < 0) {
            currentDirection = -newDirection;
        } else {
            currentDirection = newDirection;
        }
    }

    public void turnRight(int amount) {
        int newDirection = currentDirection + amount;
        currentDirection = newDirection % 360;
    }

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
