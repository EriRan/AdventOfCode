package fi.eriran.day12.calculation.flight;

import fi.eriran.day12.pojo.Command;
import fi.eriran.day12.pojo.DirectionCommand;
import fi.eriran.day12.pojo.FlightPathResponse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightPathCalculatorTest {

    private final FlightPathCalculator flightPathCalculator;

    public FlightPathCalculatorTest() {
        flightPathCalculator = new FlightPathCalculator();
    }

    @Test
    void leftTurn() {
        List<DirectionCommand> directionCommands = new ArrayList<>();
        //Go one to east
        directionCommands.add(new DirectionCommand(Command.FORWARD, 1));
        //Turn towards north
        directionCommands.add(new DirectionCommand(Command.LEFT, 90));
        //Move to north
        directionCommands.add(new DirectionCommand(Command.FORWARD, 1));
        FlightPathResponse response = flightPathCalculator.calculate(directionCommands);
        assertEquals(1, response.getEast());
        assertEquals(1, response.getNorth());
    }

    @Test
    void rightTurn() {
        List<DirectionCommand> directionCommands = new ArrayList<>();
        //Go one to east
        directionCommands.add(new DirectionCommand(Command.FORWARD, 1));
        //Turn towards south
        directionCommands.add(new DirectionCommand(Command.RIGHT, 90));
        //Move to south
        directionCommands.add(new DirectionCommand(Command.FORWARD, 1));
        FlightPathResponse response = flightPathCalculator.calculate(directionCommands);
        assertEquals(1, response.getEast());
        assertEquals(-1, response.getNorth());
    }

    @Test
    void turnPast360WithRight() {
        List<DirectionCommand> directionCommands = new ArrayList<>();
        //Go one to east
        directionCommands.add(new DirectionCommand(Command.FORWARD, 1));
        //Do 360 turn and then turn to south with the remaining rotation
        directionCommands.add(new DirectionCommand(Command.RIGHT, 450));
        //Move to south
        directionCommands.add(new DirectionCommand(Command.FORWARD, 1));
        FlightPathResponse response = flightPathCalculator.calculate(directionCommands);
        assertEquals(1, response.getEast());
        assertEquals(-1, response.getNorth());
    }

    @Test
    void turnPast360WithLeft() {
        List<DirectionCommand> directionCommands = new ArrayList<>();
        //Go one to east
        directionCommands.add(new DirectionCommand(Command.FORWARD, 1));
        //Turn west
        directionCommands.add(new DirectionCommand(Command.LEFT, 180));
        //Move to west
        directionCommands.add(new DirectionCommand(Command.FORWARD, 1));
        FlightPathResponse response = flightPathCalculator.calculate(directionCommands);
        assertEquals(0, response.getEast());
        assertEquals(0, response.getNorth());
    }
}