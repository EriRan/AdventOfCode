package fi.eriran.twozerotwozero.day11.calculation.evolution;

import fi.eriran.twozerotwozero.day11.pojo.seat.SeatMap;

public interface SeatStateEvolver {

    SeatMap createEvolved(SeatMap seatMap);
}
