package fi.eriran._2021.day2.parser;

public class MovementCommand {

    private MovementDirection direction;
    private int value;

    public MovementCommand(MovementDirection direction, int value) {
        this.direction = direction;
        this.value = value;
    }

    public MovementDirection getDirection() {
        return direction;
    }

    public void setDirection(MovementDirection direction) {
        this.direction = direction;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
