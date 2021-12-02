package fi.eriran.twozerotwozero.day12.calculation.flight;

public interface FlightState {

    int getEastDistance();

    int getNorthDistance();

    void moveEast(int amount);

    void moveSouth(int amount);

    void moveWest(int amount);

    void moveNorth(int amount);

    void turnLeft(int amount);

    void turnRight(int amount);

    void moveForward(int amount);
}
