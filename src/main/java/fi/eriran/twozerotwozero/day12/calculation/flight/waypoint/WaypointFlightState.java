package fi.eriran.twozerotwozero.day12.calculation.flight.waypoint;

import fi.eriran.twozerotwozero.day12.calculation.flight.AbstractFlightState;

class WaypointFlightState extends AbstractFlightState {

    private int waypointEast;
    private int waypointNorth;

    public WaypointFlightState() {
        super();
        waypointEast = 10;
        waypointNorth = 1;
    }

    @Override
    public void moveEast(int amount) {
        waypointEast += amount;
    }

    @Override
    public void moveSouth(int amount) {
        waypointNorth -= amount;
    }

    @Override
    public void moveWest(int amount) {
        waypointEast -= amount;
    }

    @Override
    public void moveNorth(int amount) {
        waypointNorth += amount;
    }

    @Override
    public void turnLeft(int amount) {
        if (amount < 0) {
            turnRight(amount);
            return;
        }
        //assuming we will always end up with round numbers
        double angleInRadians = -Math.toRadians(amount);
        double rotatedEast = ((waypointEast * Math.cos(angleInRadians)) + (waypointNorth * Math.sin(angleInRadians)));
        double rotatedNorth = (-(waypointEast * Math.sin(angleInRadians)) + (waypointNorth * Math.cos(angleInRadians)));
        waypointEast = (int) Math.round(rotatedEast);
        waypointNorth = (int) Math.round(rotatedNorth);
    }

    @Override
    public void turnRight(int amount) {
        if (amount < 0) {
            turnLeft(amount);
            return;
        }
        //assuming we will always end up with round numbers
        double angleInRadians = Math.toRadians(amount);
        double rotatedEast = (waypointEast * Math.cos(angleInRadians)) + (waypointNorth * Math.sin(angleInRadians));
        double rotatedNorth = (-waypointEast * Math.sin(angleInRadians)) + (waypointNorth * Math.cos(angleInRadians));
        waypointEast = (int) Math.round(rotatedEast);
        waypointNorth = (int) Math.round(rotatedNorth);
    }

    @Override
    public void moveForward(int amount) {
        eastDistance += waypointEast * amount;
        northDistance += waypointNorth * amount;
    }

    public int getWaypointEast() {
        return waypointEast;
    }

    public int getWaypointNorth() {
        return waypointNorth;
    }
}
