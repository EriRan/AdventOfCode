package fi.eriran._2021.day2.parser;

public class MovementCommand {

    private MovementDirection direction;
    private int distance;

    public MovementCommand(MovementDirection direction, int distance) {
        this.direction = direction;
        this.distance = distance;
    }

    public MovementDirection getDirection() {
        return direction;
    }

    public void setDirection(MovementDirection direction) {
        this.direction = direction;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
