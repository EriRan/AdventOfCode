package fi.eriran.day11.util;

import fi.eriran.day11.parser.converter.PositionToCharacterConverter;
import fi.eriran.day11.pojo.seat.SeatMap;

public class SeatMapPrinter {

    public void print(SeatMap seatMap) {
        for (int x = 0; x <= seatMap.getMaxY(); x++) {
            for (int y = 0; y <= seatMap.getMaxX(); y++) {
                System.out.print(PositionToCharacterConverter.convert(seatMap.getCoordinate(x,y)));
            }
            System.out.println();
        }
    }
}
