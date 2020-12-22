package fi.eriran.day11.calculation.evolution;

import fi.eriran.day11.pojo.seat.SeatMap;

public interface SeatStateEvolver {

    SeatMap createEvolved(SeatMap seatMap);
}
