package fi.eriran.twozerotwozero.day11.util;

import fi.eriran.twozerotwozero.day11.pojo.Position;
import fi.eriran.twozerotwozero.day11.pojo.seat.SeatMap;

public class SeatMapCondition {

    private SeatMapCondition() {
    }

    public static boolean isOccupied(SeatMap seatMap, int x, int y) {
        return Position.OCCUPIED_SEAT.equals(seatMap.getCoordinate(x, y));
    }
}
