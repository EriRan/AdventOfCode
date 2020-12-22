package fi.eriran.day12.calculation.flight;

import fi.eriran.day12.pojo.DirectionCommand;
import fi.eriran.day12.pojo.FlightPathResponse;

import java.util.List;

public interface FlightPathCalculator {
    FlightPathResponse calculate(List<DirectionCommand> directionCommands);
}
