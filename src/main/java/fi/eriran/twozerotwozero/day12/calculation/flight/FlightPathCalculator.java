package fi.eriran.twozerotwozero.day12.calculation.flight;

import fi.eriran.twozerotwozero.day12.pojo.DirectionCommand;
import fi.eriran.twozerotwozero.day12.pojo.FlightPathResponse;

import java.util.List;

public interface FlightPathCalculator {
    FlightPathResponse calculate(List<DirectionCommand> directionCommands);
}
