package fi.eriran._2020.day11.calculation;

import fi.eriran._2020.day11.pojo.Position;
import fi.eriran._2020.day11.pojo.seat.SeatMap;

public class OccupiedSeatCounter {

    public int count(SeatMap seatMap) {
        int count = 0;
        for (int x = 0; x <= seatMap.getMaxX(); x++) {
            for (int y = 0; y <= seatMap.getMaxY(); y++) {
                if (Position.OCCUPIED_SEAT.equals(seatMap.getCoordinate(x,y))) {
                    count++;
                }
            }
        }
        return count;
    }
}
