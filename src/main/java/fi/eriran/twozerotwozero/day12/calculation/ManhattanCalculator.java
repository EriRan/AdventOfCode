package fi.eriran.twozerotwozero.day12.calculation;

import fi.eriran.twozerotwozero.day12.pojo.FlightPathResponse;

public class ManhattanCalculator {

    public int calculate(FlightPathResponse flightPathResponse) {
        return Math.abs(flightPathResponse.getEast()) + Math.abs(flightPathResponse.getNorth());
    }
}
