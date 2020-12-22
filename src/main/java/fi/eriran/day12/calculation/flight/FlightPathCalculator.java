package fi.eriran.day12.calculation.flight;

import fi.eriran.day12.pojo.DirectionCommand;
import fi.eriran.day12.pojo.FlightPathResponse;

import java.util.List;

public class FlightPathCalculator {

    public FlightPathResponse calculate(List<DirectionCommand> directionCommands) {
        FlightState state = new FlightState();
        directionCommands.forEach(directionCommand -> processOneCommand(state, directionCommand));
        return new FlightPathResponse(
                state.getEastDistance(),
                state.getNorthDistance()
        );
    }

    private void processOneCommand(FlightState state, DirectionCommand directionCommand) {
        switch (directionCommand.getCommand()) {
            case NORTH:
                state.moveNorth(directionCommand.getAmount());
                break;
            case EAST:
                state.moveEast(directionCommand.getAmount());
                break;
            case SOUTH:
                state.moveSouth(directionCommand.getAmount());
                break;
            case WEST:
                state.moveWest(directionCommand.getAmount());
                break;
            case LEFT:
                state.turnLeft(directionCommand.getAmount());
                break;
            case FORWARD:
                state.moveForward(directionCommand.getAmount());
                break;
            case RIGHT:
                state.turnRight(directionCommand.getAmount());
                break;
            default:
                throw new IllegalArgumentException("Unrecognised argument: " + directionCommand.getCommand());
        }
    }
}
