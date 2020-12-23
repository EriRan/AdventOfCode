package fi.eriran.day12.calculation.flight.waypoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaypointFlightStateTest {

    @Test
    void exampleRightTurn() {
        WaypointFlightState state = new WaypointFlightState();
        state.moveNorth(3);
        state.turnRight(90);
        assertEquals(4, state.getWaypointEast());
        assertEquals(-10, state.getWaypointNorth());
    }

    @Test
    void leftTurn() {
        WaypointFlightState state = new WaypointFlightState();
        state.turnLeft(90);
        assertEquals(-1, state.getWaypointEast());
        assertEquals(10, state.getWaypointNorth());
    }
}