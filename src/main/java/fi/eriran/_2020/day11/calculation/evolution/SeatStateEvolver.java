package fi.eriran._2020.day11.calculation.evolution;

import fi.eriran._2020.day11.pojo.seat.SeatMap;

public interface SeatStateEvolver {

    SeatMap createEvolved(SeatMap seatMap);
}
